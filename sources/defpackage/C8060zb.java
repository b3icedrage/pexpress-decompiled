package defpackage;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8060zb implements C7834yW.a {
    @Override // defpackage.C7834yW.a
    public final boolean b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
        return d.o(name, "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.C7834yW.a
    @NotNull
    public final InterfaceC7809yN1 c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        C8060zb c8060zb = C0567Ab.f;
        Class<?> cls = sslSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        Intrinsics.checkNotNull(superclass);
        return new C0567Ab(superclass);
    }
}
