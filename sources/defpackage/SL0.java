package defpackage;

import com.pexpress.tool.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SL0 implements RL0 {

    @NotNull
    public final UL0 a = new UL0("English", "US", "en", "Language", "Please choose your language", "Next", "Save changes", R.drawable.ic_lang_icon_usa, false);

    @NotNull
    public final UL0 b = new UL0("Русский", "RU", "ru", "Язык", "Пожалуйста, выберите Ваш язык", "Далее", "Сохранить изменения", R.drawable.ic_lang_icon_russia, false);

    @NotNull
    public final UL0 c = new UL0("Bahasa Indonesia", "ID", "id", "Bahasa", "Silakan pilih bahasa Anda", "Berikutnya", "Simpan perubahan", R.drawable.ic_lang_icon_indonesia, false);

    @NotNull
    public final UL0 d = new UL0("Bahasa Melayu", "MY", "ms", "Bahasa", "Sila pilih bahasa anda", "Seterusnya", "Simpan perubahan", R.drawable.ic_lang_icon_malaysia, false);

    @NotNull
    public final UL0 e = new UL0("Español", "ES", "es", "Idioma", "Por favor elige tu idioma", "Siguiente", "Guardar cambios", R.drawable.ic_lang_icon_spain, false);

    @NotNull
    public final UL0 f = new UL0("ไทย", "TH", "th", "ภาษา", "กรุณาเลือกภาษาของคุณ", "ถัดไป", "บันทึกการเปลี่ยนแปลง", R.drawable.ic_lang_icon_thailand, false);

    @NotNull
    public final UL0 g = new UL0("Tiếng Việt", "VN", "vi", "Ngôn ngữ", "Làm ơn chọn ngôn ngữ của bạn", "Kế tiếp", "Lưu thay đổi", R.drawable.ic_lang_icon_vietnam, false);

    @NotNull
    public final UL0 h = new UL0("中文", "CN", "zh", "语言", "请选择您的语言", "下一个", "保存更改", R.drawable.ic_lang_icon_china, false);

    @NotNull
    public final UL0 i = new UL0("Türkçe", "TR", "tr", "Dil", "Lütfen dilinizi seçiniz", "Sonraki", "Değişiklikleri kaydet", R.drawable.ic_lang_icon_turkey, false);

    @NotNull
    public final UL0 j = new UL0("한국의", "KO", "ko", "언어", "귀하의 언어를 선택하십시오.", "다음", "변경사항 저장", R.drawable.ic_lang_icon_south_korea, false);

    @NotNull
    public final UL0 k = new UL0("हिन्दी", "IN", "hi", "भाषा", "कृपया अपनी भाषा चुनें", "अगला", "पुष्टि करें", R.drawable.ic_lang_icon_india, false);

    @NotNull
    public final UL0 l;

    @NotNull
    public final UL0 m;

    @NotNull
    public final UL0 n;

    public SL0() {
        Intrinsics.checkNotNullParameter("Português do Brasil", "languageName");
        Intrinsics.checkNotNullParameter("BR", "languageTwoLettersRegionCode");
        Intrinsics.checkNotNullParameter("pt", "languageTwoLettersLanguageCode");
        Intrinsics.checkNotNullParameter("Idioma", "languageSelectionTitle");
        Intrinsics.checkNotNullParameter("Por favor escolha o seu idioma", "languageSelectionSubTitle");
        Intrinsics.checkNotNullParameter("Próximo", "languageSelectionButtonNextText");
        Intrinsics.checkNotNullParameter("Guardar cambios", "languageSelectionButtonConfirmText");
        this.l = new UL0("العربية", "AE", "ar", "اللغة", "يرجى اختيار لغتك", "التالي", "حفظ التغييرات", R.drawable.ic_lang_icon_arabic, false);
        Intrinsics.checkNotNullParameter("Tagalog", "languageName");
        Intrinsics.checkNotNullParameter("PH", "languageTwoLettersRegionCode");
        Intrinsics.checkNotNullParameter("tl", "languageTwoLettersLanguageCode");
        Intrinsics.checkNotNullParameter("Wika", "languageSelectionTitle");
        Intrinsics.checkNotNullParameter("Mangyaring piliin ang iyong wika", "languageSelectionSubTitle");
        Intrinsics.checkNotNullParameter("Susunod", "languageSelectionButtonNextText");
        Intrinsics.checkNotNullParameter("I-save ang mga pagbabago", "languageSelectionButtonConfirmText");
        this.m = new UL0("Português do Brasil", "PT", "pt", "Idioma", "Por favor escolha o seu idioma", "Próximo", "Salvar alterações", R.drawable.ic_lang_icon_brazil, false);
        Intrinsics.checkNotNullParameter("日本語", "languageName");
        Intrinsics.checkNotNullParameter("JP", "languageTwoLettersRegionCode");
        Intrinsics.checkNotNullParameter("ja", "languageTwoLettersLanguageCode");
        Intrinsics.checkNotNullParameter("言語", "languageSelectionTitle");
        Intrinsics.checkNotNullParameter("言語を選択してください", "languageSelectionSubTitle");
        Intrinsics.checkNotNullParameter("さらに", "languageSelectionButtonNextText");
        Intrinsics.checkNotNullParameter("変更を保存する", "languageSelectionButtonConfirmText");
        this.n = new UL0("Français", "FR", "fr", "Langue", "Veuillez sélectionner votre langue", "ensuite", "Sauvegarder les changements", R.drawable.ic_lang_icon_franch, false);
        Intrinsics.checkNotNullParameter("Українська", "languageName");
        Intrinsics.checkNotNullParameter("UA", "languageTwoLettersRegionCode");
        Intrinsics.checkNotNullParameter("uk", "languageTwoLettersLanguageCode");
        Intrinsics.checkNotNullParameter("Мова", "languageSelectionTitle");
        Intrinsics.checkNotNullParameter("Будь ласка, виберіть Вашу мову", "languageSelectionSubTitle");
        Intrinsics.checkNotNullParameter("Далі", "languageSelectionButtonNextText");
        Intrinsics.checkNotNullParameter("Зберегти зміни", "languageSelectionButtonConfirmText");
        Intrinsics.checkNotNullParameter("Қазақ", "languageName");
        Intrinsics.checkNotNullParameter("KZ", "languageTwoLettersRegionCode");
        Intrinsics.checkNotNullParameter("kk", "languageTwoLettersLanguageCode");
        Intrinsics.checkNotNullParameter("Тілі", "languageSelectionTitle");
        Intrinsics.checkNotNullParameter("Тіліңізді таңдаңыз", "languageSelectionSubTitle");
        Intrinsics.checkNotNullParameter("Келесі", "languageSelectionButtonNextText");
        Intrinsics.checkNotNullParameter("Өзгерістерді сақтау", "languageSelectionButtonConfirmText");
    }

    @Override // defpackage.RL0
    @NotNull
    public final void a(@NotNull UL0 lang) {
        Intrinsics.checkNotNullParameter(lang, "lang");
    }

    @Override // defpackage.RL0
    @NotNull
    public final List<UL0> b() {
        return WE.f(this.a, this.e, this.m, this.c, this.k, this.g, this.h, this.j, this.f, this.i, this.d, this.l, this.n, this.b);
    }

    @Override // defpackage.RL0
    @NotNull
    public final UL0 defaultValue() {
        Object next;
        Iterator<T> it = b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.a(((UL0) next).g, C1952Ru.j()));
        UL0 ul0 = (UL0) next;
        return ul0 == null ? this.a : ul0;
    }
}
