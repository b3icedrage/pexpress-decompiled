package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8110zn1<T> implements InterfaceC6359rU1<T> {
    public final long d;
    public InterfaceC6779tU1 e;

    @NotNull
    public final C2030Su g;

    public C8110zn1(int i, @NotNull EnumC1796Pu enumC1796Pu, long j) {
        this.d = j;
        this.g = C2889bA.a(i == 0 ? 1 : i, 4, enumC1796Pu);
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void a(@Nullable Throwable th) {
        this.g.k(th, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull LM lm) throws Throwable {
        C7900yn1 c7900yn1;
        Object objF;
        if (lm instanceof C7900yn1) {
            c7900yn1 = (C7900yn1) lm;
            int i = c7900yn1.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7900yn1.g = i - Integer.MIN_VALUE;
            } else {
                c7900yn1 = new C7900yn1(this, lm);
            }
        } else {
            c7900yn1 = new C7900yn1(this, lm);
        }
        Object obj = c7900yn1.d;
        MN mn = MN.d;
        int i2 = c7900yn1.g;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C2030Su c2030Su = this.g;
            c7900yn1.g = 1;
            c2030Su.getClass();
            objF = C2030Su.F(c2030Su, c7900yn1);
            if (objF == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            objF = ((C3308dA) obj).a;
        }
        Throwable thA = C3308dA.a(objF);
        if (thA != null) {
            throw thA;
        }
        if (!(objF instanceof C3308dA.b)) {
            return objF;
        }
        C3308dA.a(objF);
        return null;
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void d(@NotNull T t) {
        C2030Su c2030Su = this.g;
        if (c2030Su.n(t) instanceof C3308dA.b) {
            throw new IllegalArgumentException(("Element " + t + " was not added to channel because it was full, " + c2030Su).toString());
        }
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void f(@NotNull InterfaceC6779tU1 interfaceC6779tU1) {
        this.e = interfaceC6779tU1;
        if (interfaceC6779tU1 != null) {
            interfaceC6779tU1.s(this.d);
        } else {
            Intrinsics.l("subscription");
            throw null;
        }
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void onComplete() {
        this.g.a(null);
    }
}
