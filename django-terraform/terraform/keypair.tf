resource "aws_key_pair" "production" {
  key_name   = "nv-django.pem"
  public_key = "~/.ssh/id_rsa.pub"
}
