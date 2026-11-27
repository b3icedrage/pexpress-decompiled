package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class FN {

    @NotNull
    public static final List a;

    static {
        try {
            a = JH1.p(FH1.a(Arrays.asList(new C4229hb()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
