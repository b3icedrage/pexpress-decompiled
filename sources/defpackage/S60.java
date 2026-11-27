package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {403, 426, 478}, m = "invokeSuspend")
public final class S60 extends AW1 implements Function2<KN, JM<? super VU1>, Object> {
    public Object d;
    public Object e;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public InterfaceC8038zU l;
    public int m;
    public int n;
    public int o;
    public final /* synthetic */ T60 p;
    public final /* synthetic */ C3027bp1 q;
    public final /* synthetic */ C3027bp1 r;
    public final /* synthetic */ C3027bp1 s;
    public final /* synthetic */ C3027bp1 t;
    public final /* synthetic */ C5803oo1 u;
    public final /* synthetic */ C3027bp1 v;
    public final /* synthetic */ C3027bp1 w;
    public final /* synthetic */ C3027bp1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S60(T60 t60, C3027bp1 c3027bp1, C3027bp1 c3027bp2, C3027bp1 c3027bp3, C3027bp1 c3027bp4, C5803oo1 c5803oo1, C3027bp1 c3027bp5, C3027bp1 c3027bp6, C3027bp1 c3027bp7, JM jm) {
        super(2, jm);
        this.p = t60;
        this.q = c3027bp1;
        this.r = c3027bp2;
        this.s = c3027bp3;
        this.t = c3027bp4;
        this.u = c5803oo1;
        this.v = c3027bp5;
        this.w = c3027bp6;
        this.x = c3027bp7;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        C3027bp1 c3027bp1 = this.w;
        C3027bp1 c3027bp2 = this.x;
        return new S60(this.p, this.q, this.r, this.s, this.t, this.u, this.v, c3027bp1, c3027bp2, completion);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super VU1> jm) {
        return ((S60) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0312  */
    /* JADX WARN: Code duplicated, block: B:105:0x032c  */
    /* JADX WARN: Code duplicated, block: B:106:0x032e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0333  */
    /* JADX WARN: Code duplicated, block: B:110:0x0338  */
    /* JADX WARN: Code duplicated, block: B:112:0x033b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0345  */
    /* JADX WARN: Code duplicated, block: B:117:0x035e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0362  */
    /* JADX WARN: Code duplicated, block: B:120:0x0364  */
    /* JADX WARN: Code duplicated, block: B:123:0x0369  */
    /* JADX WARN: Code duplicated, block: B:124:0x036e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0371  */
    /* JADX WARN: Code duplicated, block: B:127:0x0378  */
    /* JADX WARN: Code duplicated, block: B:130:0x0387  */
    /* JADX WARN: Code duplicated, block: B:131:0x0389  */
    /* JADX WARN: Code duplicated, block: B:134:0x0390  */
    /* JADX WARN: Code duplicated, block: B:135:0x0392  */
    /* JADX WARN: Code duplicated, block: B:80:0x0245  */
    /* JADX WARN: Code duplicated, block: B:81:0x0248  */
    /* JADX WARN: Code duplicated, block: B:83:0x024e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0266  */
    /* JADX WARN: Code duplicated, block: B:87:0x0278  */
    /* JADX WARN: Code duplicated, block: B:90:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:94:0x02db  */
    /* JADX WARN: Code duplicated, block: B:97:0x030d  */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02c9, code lost:
    
        if (r9 == r6) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [XY0] */
    /* JADX WARN: Type inference failed for: r3v20, types: [OS1] */
    /* JADX WARN: Type inference failed for: r3v22, types: [Gs] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x02c9 -> B:93:0x02cc). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S60.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
