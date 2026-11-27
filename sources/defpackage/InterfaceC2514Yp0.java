package defpackage;

import java.io.Closeable;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Yp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2514Yp0 extends KN, Closeable {

    /* JADX INFO: renamed from: Yp0$a */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [KN, Yp0, dq0] */
        /* JADX WARN: Type inference failed for: r8v1, types: [KN, Yp0] */
        /* JADX WARN: Type inference failed for: r8v4, types: [Yp0] */
        public static final Object a(AbstractC3447dq0 abstractC3447dq0, C3241cr0 c3241cr0, LM lm) throws Throwable {
            C2592Zp0 c2592Zp0;
            if (lm instanceof C2592Zp0) {
                c2592Zp0 = (C2592Zp0) lm;
                int i = c2592Zp0.h;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c2592Zp0.h = i - Integer.MIN_VALUE;
                } else {
                    c2592Zp0 = new C2592Zp0(lm);
                }
            } else {
                c2592Zp0 = new C2592Zp0(lm);
            }
            Object objT = c2592Zp0.g;
            Object obj = MN.d;
            int i2 = c2592Zp0.h;
            if (i2 == 0) {
                C1795Pt1.b(objT);
                C4002gV1 c4002gV1 = c3241cr0.e;
                c2592Zp0.d = abstractC3447dq0;
                c2592Zp0.e = c3241cr0;
                c2592Zp0.h = 1;
                IN in = C4287hq0.a;
                C2684aG0 c2684aG0 = new C2684aG0(c4002gV1);
                objT = abstractC3447dq0.getE().t(c2684aG0).t(C4287hq0.a);
                XF0 xf0 = (XF0) c2592Zp0.getContext().p(XF0.a.d);
                if (xf0 != null) {
                    c2684aG0.W(new Ec2(xf0.A(true, true, new C3837fi(c2684aG0, 4)), 0));
                }
                if (objT != obj) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objT);
                return objT;
            }
            c3241cr0 = c2592Zp0.e;
            abstractC3447dq0 = c2592Zp0.d;
            C1795Pt1.b(objT);
            CoroutineContext coroutineContext = (CoroutineContext) objT;
            C7624xW c7624xWE = C5189lv.e(abstractC3447dq0, coroutineContext.t(new JL0(coroutineContext)), new C2819aq0(abstractC3447dq0, c3241cr0, null), 2);
            c2592Zp0.d = null;
            c2592Zp0.e = null;
            c2592Zp0.h = 2;
            Object objZ = c7624xWE.z(c2592Zp0);
            return objZ == obj ? obj : objZ;
        }
    }

    void N0(@NotNull C1782Pp0 c1782Pp0);

    @NotNull
    Set<InterfaceC3657eq0<?>> b0();

    @Nullable
    Object h0(@NotNull C3241cr0 c3241cr0, @NotNull LM lm);
}
