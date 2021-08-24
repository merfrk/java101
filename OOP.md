# 1. Ödev Üniversite Yönetim Sistemi
Üniversiteye ait sınıflıklar, çalışma ofisleri ve departmanlar vardır.<br/>
Departmanlara ait ofisler vardır.<br/>
Üniversiteye ait çalışanlar vardır. Bu çalışanlar profesör veya memur olabilir.<br/>
Her çalışan bir ofiste çalışır.<br/>
Bu sistemi tasvir eden Class (Sınıf) diyagramını çiziniz.<br/>
Not : Sınıflara ait nitelik ve davranışların belirtilmesine gerek yoktur.
![diyagram1](https://github.com/merfrk/java101/blob/master/Untitled%20Diagram.png)

# 2. Ödev Hayvanat Bahçesi Yönetimi
Hayvanlar:
Atlar (atlar, zebralar, eşekler vb.),
Kedigiller (kaplanlar, aslanlar vb.),
Kemirgenler (sıçanlar, kunduzlar vb.) gibi gruplardaki türlerle karakterize edilir.
Hayvanlar hakkında depolanan bilgilerin çoğu tüm gruplamalar için aynıdır.
tür adı, ağırlığı, yaşı vb.
Sistem ayrıca her hayvan için belirli ilaçların dozajını alabilmeli => getDosage ()
Sistem Yem verme zamanlarını hesaplayabilmelidir => getFeedSchedule ()
Sistemin bu işlevleri yerine getirme mantığı, her gruplama için farklı olacaktır. Örneğin, atlar için yem verme algoritması farklı olup, kaplanlar için farklı olacaktır.

Polimorfizm modelini kullanarak, yukarıda açıklanan durumu ele almak için bir sınıf diyagramı tasarlayın.
![diyagram2](https://github.com/merfrk/java101/blob/master/Untitled%20Diagram2.png)

# 3. Ödev Uçuş Yönetim Sistemi
Uçuşların ve pilotların yönetimi için bir sistem tasarlayın.
Hava yolu şirketleri uçuşları gerçekleştirir. Her hava yolunun bir kimliği vardır.
Hava yolu şirketi, farklı tipteki uçaklara sahiptir.
Uçaklar çalışır veya onarım durumunda olabilir.
Her uçuşun benzersiz kimliği, kalkacağı ve ineceği havaalanı, kalkış ve iniş saatleri vardır.
Her uçuşun bir pilotu ve yardımcı pilotu vardır ve uçağı kullanırlar.
Havaalanlarının benzersiz kimlikleri ve isimleri vardır.
Hava yolu şirketlerinin pilotları vardır ve her pilotun bir deneyim seviyesi mevcuttur.
Bir uçak tipi, belirli sayıda pilota ihtiyaç duyabilir.
Bu sistemi tasvir eden Class(Sınıf) diyagramını çiziniz.
![diyagram3](https://github.com/merfrk/java101/blob/master/Untitled%20Diagram3.png)

# 4. Ödev Online Film Sistemi
Online film satan veya kiralayan uygulamanın sistemini tasarlayın.
Uygulamada filmler listelenebilir, sıralanabilir ve kullanıcılar uygulamaya abone olabilir.
Kullanıcılar abonelik için sistem üzerinden kredi satın alır.
Sadece abone olan kullanıcılar, kredileri ile film kiralayabilir ve kiraladığı filmin kredi bedeli kadar hesabından düşülür.
Normal kullanıcılar ve aboneler film satın alabilirler.
Eğer film mevcut değil ise talep edilebilir.
Bu sistemi tasvir eden Class(Sınıf) diyagramını çiziniz.
![diyagram4](https://github.com/merfrk/java101/blob/master/Untitled%20Diagram4.png)
