provider "aws" {
  region = "ap-southeast-2"
}

resource "aws_instance" "example" {
  ami           = "ami-8267abe0"
  instance_type = "t2.micro"
}
