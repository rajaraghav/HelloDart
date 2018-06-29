import 'Person.dart';

void main()
{
  print("ssup "+getName());
}

String getName()
{
  var p = new Person("ada");
  return p.getName();
}