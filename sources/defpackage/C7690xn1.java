package defpackage;

import java.util.Arrays;
import java.util.ServiceConfigurationError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7690xn1 {

    @NotNull
    public static final InterfaceC7384wM[] a;

    static {
        try {
            a = (InterfaceC7384wM[]) JH1.p(FH1.a(Arrays.asList(new InterfaceC7384wM[0]).iterator())).toArray(new InterfaceC7384wM[0]);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
