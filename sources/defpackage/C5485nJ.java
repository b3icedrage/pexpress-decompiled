package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5485nJ<E> extends C2030Su<E> {

    @NotNull
    public final EnumC1796Pu o;

    public C5485nJ(int i, @NotNull EnumC1796Pu enumC1796Pu) {
        super(i);
        this.o = enumC1796Pu;
        if (enumC1796Pu != EnumC1796Pu.d) {
            if (i < 1) {
                throw new IllegalArgumentException(C1332Jw.a(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + C2017Sp1.a.b(C2030Su.class).f() + " instead").toString());
        }
    }

    @Override // defpackage.C2030Su
    public final boolean A() {
        return this.o == EnumC1796Pu.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v8 */
    public final Object N(boolean z, Object obj) {
        C3727fA c3727fA;
        if (this.o == EnumC1796Pu.g) {
            Object objN = super.n(obj);
            return (!(objN instanceof C3308dA.b) || (objN instanceof C3308dA.a)) ? objN : Unit.a;
        }
        Object obj2 = C2450Xu.d;
        C3727fA c3727fA2 = (C3727fA) C2030Su.j.get(this);
        while (true) {
            long andIncrement = C2030Su.e.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zY = y(andIncrement, false);
            int i = C2450Xu.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c3727fA2.g != j3) {
                C3727fA c3727fAB = C2030Su.b(this, j3, c3727fA2);
                if (c3727fAB != null) {
                    c3727fA = c3727fAB;
                } else if (zY) {
                    return new C3308dA.a(v());
                }
            } else {
                c3727fA = c3727fA2;
            }
            int iF = C2030Su.f(this, c3727fA, i2, obj, j, obj2, zY);
            C3727fA c3727fA3 = c3727fA;
            if (iF == 0) {
                c3727fA3.b();
                return Unit.a;
            }
            if (iF == 1) {
                return Unit.a;
            }
            if (iF == 2) {
                if (zY) {
                    c3727fA3.i();
                    return new C3308dA.a(v());
                }
                InterfaceC7449wf2 interfaceC7449wf2 = obj2 instanceof InterfaceC7449wf2 ? (InterfaceC7449wf2) obj2 : null;
                if (interfaceC7449wf2 != null) {
                    interfaceC7449wf2.c(c3727fA3, i2 + i);
                }
                p((c3727fA3.g * j2) + ((long) i2));
                return Unit.a;
            }
            if (iF == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iF == 4) {
                if (j < C2030Su.g.get(this)) {
                    c3727fA3.b();
                }
                return new C3308dA.a(v());
            }
            if (iF == 5) {
                c3727fA3.b();
            }
            c3727fA2 = c3727fA3;
            obj = (E) obj;
        }
    }

    @Override // defpackage.C2030Su, defpackage.InterfaceC7364wF1
    @Nullable
    public final Object j(@NotNull JM jm, Object obj) throws Throwable {
        Object objN = N(true, obj);
        if (!(objN instanceof C3308dA.a)) {
            return Unit.a;
        }
        C3308dA.a(objN);
        throw v();
    }

    @Override // defpackage.C2030Su, defpackage.InterfaceC7364wF1
    @NotNull
    public final Object n(E e) {
        return N(false, e);
    }
}
