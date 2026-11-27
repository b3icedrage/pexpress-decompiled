package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: renamed from: yg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7871yg0<T> implements InterfaceC2236Vk1<T> {
    public static final int d = Math.max(1, Integer.getInteger("rx2.buffer-size", UserVerificationMethods.USER_VERIFY_PATTERN).intValue());

    @Override // defpackage.InterfaceC2236Vk1
    public final void b(InterfaceC6359rU1<? super T> interfaceC6359rU1) {
        if (interfaceC6359rU1 instanceof InterfaceC1518Mg0) {
            g((InterfaceC1518Mg0) interfaceC6359rU1);
        } else {
            C1589Ne.r(interfaceC6359rU1, "s is null");
            g(new C4671jS1(interfaceC6359rU1));
        }
    }

    public final C1207Ig0 e() {
        int i = d;
        C1589Ne.x(i, "bufferSize");
        return new C1207Ig0(this, i);
    }

    public final void g(InterfaceC1518Mg0<? super T> interfaceC1518Mg0) {
        C1589Ne.r(interfaceC1518Mg0, "s is null");
        try {
            h(interfaceC1518Mg0);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C4994l.j(th);
            EB1.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void h(InterfaceC1518Mg0 interfaceC1518Mg0);
}
