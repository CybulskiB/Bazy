package Bazy_danych.Aplikacja.mariadb;

public enum Procedures {
	LICZBA_GODZIN_PRACOWNIKA,WYNAGRODZENIE_PRACOWNIKA,ZESPOLY_PRACOWNIKA,PROJEKTY_PRACOWNIKA,DANE_PRACOWNIKA,HISTORIA_PRACOWNIKA,
	
	BUDZET_ZESPOLU,CZLONKOWIE_ZESPOLU,USTAL_WYNAGRODZENIE,USTAL_CZAS_PRACY_CZLONKA,USTAL_CZAS_PRACY,ZATWIERDZ_WYNAGRODZENIE,	
	ZATWIERDZ_CZAS_PRACY,DODAJ_DO_ZESPOLU,USUN_Z_ZESPOLU,PRZENIES_Z_ZESPOLU,PROJEKTY_ZESPOLU,
	
	DODAJ_DOSTAWCE, DODAJ_KLIENTA,DODAJ_ZLECENIE,ZAKUP_PRODUKT,UTWORZ_PROJEKT,USTAL_BUDZET_PROJEKTU,SPRAWDZ_BILANS,ZLECENIE_INFO,ZMIEN_STATUS,
	ZATWIERDZ_BUDZET,ZM_ZARZADCY_ZESPOLU,UTWORZ_ZESPOL,ROZWIAZ_ZESPOL,
	
	KOREKTA_DANYCH,KOREKTA_HISTORII,DODAJ_DZIAL,ZWOLNIJ_PRACOWNIKA,ZM_ZARZADCY_DZIALU,PRZENIESIENIE_ZLECENIA,ZAMKNIJ_DZIAL,
	DODAJ_PRACOWNIKA,BACKUP_WCZYT,DYNAMICZNE,BACKUP_WYK;
}
