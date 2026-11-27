package kotlin.text;

import defpackage.C1952Ru;
import defpackage.C4814k70;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C0432a d;
    public static final /* synthetic */ a[] e;
    public static final /* synthetic */ C4814k70 g;

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    /* JADX INFO: renamed from: kotlin.text.a$a, reason: collision with other inner class name */
    public static final class C0432a {
        public C0432a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        a[] aVarArr = {new a("UNASSIGNED", 0), new a("UPPERCASE_LETTER", 1), new a("LOWERCASE_LETTER", 2), new a("TITLECASE_LETTER", 3), new a("MODIFIER_LETTER", 4), new a("OTHER_LETTER", 5), new a("NON_SPACING_MARK", 6), new a("ENCLOSING_MARK", 7), new a("COMBINING_SPACING_MARK", 8), new a("DECIMAL_DIGIT_NUMBER", 9), new a("LETTER_NUMBER", 10), new a("OTHER_NUMBER", 11), new a("SPACE_SEPARATOR", 12), new a("LINE_SEPARATOR", 13), new a("PARAGRAPH_SEPARATOR", 14), new a("CONTROL", 15), new a("FORMAT", 16), new a("PRIVATE_USE", 17), new a("SURROGATE", 18), new a("DASH_PUNCTUATION", 19), new a("START_PUNCTUATION", 20), new a("END_PUNCTUATION", 21), new a("CONNECTOR_PUNCTUATION", 22), new a("OTHER_PUNCTUATION", 23), new a("MATH_SYMBOL", 24), new a("CURRENCY_SYMBOL", 25), new a("MODIFIER_SYMBOL", 26), new a("OTHER_SYMBOL", 27), new a("INITIAL_QUOTE_PUNCTUATION", 28), new a("FINAL_QUOTE_PUNCTUATION", 29)};
        e = aVarArr;
        g = C1952Ru.i(aVarArr);
        d = new C0432a(null);
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) e.clone();
    }
}
