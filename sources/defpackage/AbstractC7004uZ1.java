package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7004uZ1 {
    public static final long b;
    public static final long c;
    public static final long d;
    public static final /* synthetic */ int e = 0;

    @NotNull
    public final C6120qK1 a = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);

    static {
        b.a aVar = b.e;
        R40 r40 = R40.MINUTES;
        b = c.g(1, r40);
        c = c.g(5, r40);
        d = c.g(15, r40);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull LM lm) {
        C6794tZ1 c6794tZ1;
        Object next;
        if (lm instanceof C6794tZ1) {
            c6794tZ1 = (C6794tZ1) lm;
            int i = c6794tZ1.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6794tZ1.g = i - Integer.MIN_VALUE;
            } else {
                c6794tZ1 = new C6794tZ1(this, lm);
            }
        } else {
            c6794tZ1 = new C6794tZ1(this, lm);
        }
        Object objB = c6794tZ1.d;
        Object obj = MN.d;
        int i2 = c6794tZ1.g;
        if (i2 == 0) {
            C1795Pt1.b(objB);
            c6794tZ1.g = 1;
            objB = b(c6794tZ1);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objB);
        }
        List list = (List) objB;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((C1709Or) next).b);
        C1709Or c1709Or = (C1709Or) next;
        return c1709Or == null ? (C1709Or) CollectionsKt.F(list) : c1709Or;
    }

    @Nullable
    public abstract Object b(@NotNull LM lm);

    @Nullable
    public abstract Object c(boolean z, @NotNull JM<? super Unit> jm);

    public abstract void d();
}
