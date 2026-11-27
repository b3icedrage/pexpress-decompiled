package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
public final class SS extends AW1 implements Function2<Boolean, JM<? super Pair<? extends EP1<Object>, ? extends Boolean>>, Object> {
    public Throwable d;
    public int e;
    public /* synthetic */ boolean g;
    public final /* synthetic */ IS<Object> h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SS(IS<Object> is, int i, JM<? super SS> jm) {
        super(2, jm);
        this.h = is;
        this.i = i;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        SS ss = new SS(this.h, this.i, jm);
        ss.g = ((Boolean) obj).booleanValue();
        return ss;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, JM<? super Pair<? extends EP1<Object>, ? extends Boolean>> jm) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((SS) create(bool2, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Throwable th;
        int iIntValue;
        ?? r0;
        ?? r1;
        EP1 ep1;
        ?? r2;
        MN mn = MN.d;
        ?? r3 = this.e;
        IS<Object> is = this.h;
        try {
            if (r3 == 0) {
                C1795Pt1.b(obj);
                boolean z = this.g;
                this.g = z;
                this.e = 1;
                obj = IS.f(is, z, this);
                r3 = z;
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (r3 != 1) {
                    if (r3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = this.g;
                    th = this.d;
                    C1795Pt1.b(obj);
                    r1 = z2;
                    iIntValue = ((Number) obj).intValue();
                    r0 = r1;
                    C0605An1 c0605An1 = new C0605An1(th, iIntValue);
                    r2 = r0;
                    ep1 = c0605An1;
                    return new Pair(ep1, Boolean.valueOf((boolean) r2));
                }
                boolean z3 = this.g;
                C1795Pt1.b(obj);
                r3 = z3;
            }
            ep1 = (EP1) obj;
            r2 = r3;
        } catch (Throwable th2) {
            if (r3 != 0) {
                SB0 sb0G = is.g();
                this.d = th2;
                this.g = r3;
                this.e = 2;
                Integer numE = sb0G.e();
                if (numE != mn) {
                    r1 = r3;
                    th = th2;
                    obj = numE;
                }
                return mn;
            }
            ?? r5 = r3;
            th = th2;
            iIntValue = this.i;
            r0 = r5 == true ? 1 : 0;
        }
        return new Pair(ep1, Boolean.valueOf((boolean) r2));
    }
}
