package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ic2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4446ic2 {

    @NotNull
    public static final KW1 a = XO0.b(c.d);

    @NotNull
    public static final KW1 b = XO0.b(b.d);

    @NotNull
    public static final KW1 c = XO0.b(a.d);

    /* JADX INFO: renamed from: ic2$a */
    public static final class a extends ML0 implements Function0<DateTimeFormatter> {
        public static final a d = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
        }
    }

    /* JADX INFO: renamed from: ic2$b */
    public static final class b extends ML0 implements Function0<DateTimeFormatter> {
        public static final b d = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
        }
    }

    /* JADX INFO: renamed from: ic2$c */
    public static final class c extends ML0 implements Function0<DateTimeFormatter> {
        public static final c d = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
        }
    }

    public static final Rb2 a(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new Rb2((ZoneOffset) dateTimeFormatter.parse(str, new C4236hc2()));
        } catch (DateTimeException cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            throw new NT(cause);
        }
    }
}
