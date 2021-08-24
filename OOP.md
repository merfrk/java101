#1. Ödev Üniversite Yönetim Sistemi
Üniversiteye ait sınıflıklar, çalışma ofisleri ve departmanlar vardır.<br/>
Departmanlara ait ofisler vardır.<br/>
Üniversiteye ait çalışanlar vardır. Bu çalışanlar profesör veya memur olabilir.<br/>
Her çalışan bir ofiste çalışır.<br/>
Bu sistemi tasvir eden Class (Sınıf) diyagramını çiziniz.<br/>
Not : Sınıflara ait nitelik ve davranışların belirtilmesine gerek yoktur.
![diyagram1](https://github.com/merfrk/java101/blob/master/Untitled%20Diagram.png)

#2. Ödev Hayvanat Bahçesi Yönetimi
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
