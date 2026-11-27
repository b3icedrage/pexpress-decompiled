package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0567Ab implements InterfaceC7809yN1 {

    @NotNull
    public static final C8060zb f;

    @NotNull
    public final Class<? super SSLSocket> a;

    @NotNull
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f = new C8060zb();
    }

    public C0567Ab(@NotNull Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.b = declaredMethod;
        this.c = sslSocketClass.getMethod("setHostname", String.class);
        this.d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.InterfaceC7809yN1
    public final boolean a() {
        boolean z = C7430wb.e;
        return C7430wb.e;
    }

    @Override // defpackage.InterfaceC7809yN1
    public final boolean b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.a.isInstance(sslSocket);
    }

    @Override // defpackage.InterfaceC7809yN1
    @Nullable
    public final String c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!b(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sslSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.InterfaceC7809yN1
    public final void d(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends EnumC1298Jk1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (b(sslSocket)) {
            try {
                this.b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.c.invoke(sslSocket, str);
                }
                Method method = this.e;
                C1903Rd1 c1903Rd1 = C1903Rd1.a;
                method.invoke(sslSocket, C1903Rd1.a.b(protocols));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
