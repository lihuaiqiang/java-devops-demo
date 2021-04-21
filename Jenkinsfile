//写流水线的脚本（声明式、脚本式，常用声明式因为声明式中也可以写脚本）

pipeline{
    //全部的 CICD 流程都需要在这里定义

    //只要哪个机器闲着，任何一个代理可用就可以执行
    agent any

    //定义一些环境信息
    environment {
      key = "nihao"
      hello = "大家好"
    }

    //定义流水线的加工流程
    stages{
        //流水线的所有阶段
        //语法：单引号中可以写常量，双引号可以写变量（通过$来获取变量的值）

        //0、编译
        stage('环境检查'){
            steps{
                //打印环境变量
                sh 'printenv'
                sh "echo $JENKINS_HOME"
                echo "$JENKINS_HOME"
                sh "echo $WORKSPACE"
                sh "git --version"
                sh "java -version"
                sh "docker version"
//                 sh 'mvn -v'
            }
        }

        //1、编译
        stage('编译'){
            //jenkins不配置任何环境的情况下， 仅适用docker 兼容所有场景
            agent {
                docker {
                    image 'maven:3-alpine'
                    //设置挂载
                    //args '-v /var/jenkins_home/appconfig/maven/.m2:/root/.m2'
                    //args  '-v /a/settings.xml:/app/settings.xml'
                    //docker run -v /a/settings.xml:/app/settings.xml
                 }
            }
            steps{
                echo " 编译了..."
                echo "$key"
                //这样写也行 echo "${hello}"
                echo "$hello"
                sh 'pwd && ls -alh' // a：列举所有；l：逐条列举；h：以人类识别的方式

                sh 'mvn -v'
            }
        }

        //2、测试
        stage('测试'){
            steps{
                echo " 编译了..."
            }
        }

        //3、打包
        stage('打包'){
            steps{
                echo " 编译了..."
            }
        }

        //4、部署
        stage('部署'){
            steps{
                echo " 编译了..."
            }
        }
    }
}