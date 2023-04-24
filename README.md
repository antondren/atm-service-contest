# atm-service-contest
Spring Boot Atm Service
# PL

Zespół serwisujący bankomaty przychodzi do pracy po długim weekendzie. 
System zleceń serwisowych zawiera zgłoszenia, które muszą ustawić w kolejce obsługi. 
Kolejka związana jest trasą przejazdu grupy konwojowej przez poszczególne regiony a wyznaczona trasa przejazdu pomiędzy regionami została już zatwierdzona.
Zleceń jest bardzo dużo ponieważ oprócz zaplanowanych na dzisiaj standardowych i priorytetowych prac zasilenia bankomatu, pojawiły się inne zgłoszenia które również trzeba obsłużyć. 
Jednym z takich zgłoszeń jest sygnał o niskim stanie gotówki bankomatu, który nie był na dzisiaj zaplanowany takie zgłoszenie powinno być zrealizowane zaraz po zakończeniu prac nad zleceniami planowanymi priorytetowymi w danym regionie. 
Innym jest sygnał o awarii bankomatu z którym zespół techniczny nie ma komunikacji i nie może przeprowadzić procedury zdalnego ponownego uruchomienia. Takie zgłoszenie powinno zostać zrealizowane w pierwszej kolejności w danym regionie. 
Priorytetowe planowane zasilenie bankomatu dotyczy urządzenia gdzie trend zużycia stanu gotówki jest wysoki dlatego ta operacja jest wykonywana przez zleceniami standardowymi. 

## Zadanie
Przygotuj system który przygotuje odpowiednią kolejność zleceń do obsługi dla grupy konwojowej, przy założeniu że:
1)	konwój przejeżdża przez regiony biorąc pod uwagę rosnącą kolejność przydzielonych im numerów,
2)	dany bankomat na liście zleceń dla grupy konwojowej może wystąpić tylko raz.

# EN
The ATM servicing team comes to work after a long weekend.
The service order system contains reports that need to be queued for processing.
The queue is related to the convoy group's route through individual regions, and the designated route between regions has already been approved.
There are a lot of orders, because in addition to today's planned standard and priority ATM replenishment tasks, there are other reports that also need to be handled.
One such report is a signal of low cash in the ATM, which was not planned for today; such a report should be carried out immediately after completing the planned priority tasks in a given region.
Another is a signal of an ATM failure, with which the technical team has no communication and cannot perform the remote reboot procedure. Such a report should be handled first in the given region.
Priority planned ATM replenishment concerns devices where the cash usage trend is high, so this operation is carried out before standard orders.

## Task
Prepare a system that will create the appropriate order of tasks for the convoy group, assuming that:

1) the convoy passes through the regions in ascending order of their assigned numbers,
2) a given ATM can appear only once in the list of tasks for the convoy group.

