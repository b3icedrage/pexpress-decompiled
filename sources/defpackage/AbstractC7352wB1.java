package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7352wB1 {

    @NotNull
    public final C4795k21 a = ED.c();

    @NotNull
    public final DG b = C6561sS.e();

    @Nullable
    public abstract Object a(@NotNull LM lm);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull LM lm) throws Throwable {
        C7142vB1 c7142vB1;
        InterfaceC4117h21 interfaceC4117h21;
        AbstractC7352wB1 abstractC7352wB1;
        InterfaceC4117h21 interfaceC4117h22;
        Throwable th;
        AbstractC7352wB1 abstractC7352wB2;
        if (lm instanceof C7142vB1) {
            c7142vB1 = (C7142vB1) lm;
            int i = c7142vB1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7142vB1.i = i - Integer.MIN_VALUE;
            } else {
                c7142vB1 = new C7142vB1(this, lm);
            }
        } else {
            c7142vB1 = new C7142vB1(this, lm);
        }
        Object obj = c7142vB1.g;
        MN mn = MN.d;
        int i2 = c7142vB1.i;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                if (this.b.S0()) {
                    return Unit.a;
                }
                c7142vB1.d = this;
                interfaceC4117h21 = this.a;
                c7142vB1.e = interfaceC4117h21;
                c7142vB1.i = 1;
                if (interfaceC4117h21.a(c7142vB1) != mn) {
                    abstractC7352wB1 = this;
                }
                return mn;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC4117h22 = c7142vB1.e;
                abstractC7352wB2 = c7142vB1.d;
                try {
                    C1795Pt1.b(obj);
                    DG dg = abstractC7352wB2.b;
                    Unit unit = Unit.a;
                    dg.c0(unit);
                    interfaceC4117h22.b(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC4117h22.b(null);
                    throw th;
                }
            }
            InterfaceC4117h21 interfaceC4117h23 = c7142vB1.e;
            abstractC7352wB1 = c7142vB1.d;
            C1795Pt1.b(obj);
            interfaceC4117h21 = interfaceC4117h23;
            if (abstractC7352wB1.b.S0()) {
                Unit unit2 = Unit.a;
                interfaceC4117h21.b(null);
                return unit2;
            }
            c7142vB1.d = abstractC7352wB1;
            c7142vB1.e = interfaceC4117h21;
            c7142vB1.i = 2;
            if (abstractC7352wB1.a(c7142vB1) != mn) {
                interfaceC4117h22 = interfaceC4117h21;
                abstractC7352wB2 = abstractC7352wB1;
                DG dg2 = abstractC7352wB2.b;
                Unit unit3 = Unit.a;
                dg2.c0(unit3);
                interfaceC4117h22.b(null);
                return unit3;
            }
            return mn;
        } catch (Throwable th3) {
            interfaceC4117h22 = interfaceC4117h21;
            th = th3;
            interfaceC4117h22.b(null);
            throw th;
        }
    }
}
