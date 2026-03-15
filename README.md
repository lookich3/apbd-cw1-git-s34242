1.Git wykona fast-forward wtedy, gdy branża main nie ma nowych commitów od momentu utworzenia branży feature. W takiej sytuacji Git tylko przesuwa wskaźnik branży main do przodu.
Przykład z mojego repozytorium:
po połączeniu branży feature-average z main został wykonany fast-forward

Merge commit powstaje wtedy, gdy obie branży mają własne nowe commity i Git musi połączyć ich.
Przykład z mojego repozytorium:
przy łączeniu feature-max z main powstał merge commit, bo wcześniej dodałem osobny commit bezpośrednio na main.

2.Merge zachowuje rozgałęzioną historię i najczęściej tworzy dodatkowy commit łączący dwie branży.
Przykład:
Merge branch feature-max.
Rebase przepisuje historię commitów i przenosi commity jednej branży na koniec drugiej, przez to historia jest bardziej liniowa.
Przykład z mojego repozytorium:
branża feature-min została rebased na main, a następnie połączona z main

3.Konflikt pojawił się w pliku Main.java, bo w branżach main i feature-conflict został zmieniony ten sam komunikat końcowy.
W branży feature-conflict zmieniłem komunikat na wersję z napisem feature, a w main na inną wersję. Podczas git merge feature-conflict Git zgłosił konflikt.
Rozwiązałem konflikt ręcznie w pliku Main.java, usunąłem znaczniki konfliktu i dodałem dwie wersji