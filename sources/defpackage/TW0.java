package defpackage;

import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TW0 {

    @NotNull
    public static final KW1 a = XO0.b(a.d);

    public static final class a extends ML0 implements Function0<Pattern> {
        public static final a d = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Pattern invoke() {
            return Pattern.compile("^!\\[(.*)]\\((.*)\\)");
        }
    }
}
