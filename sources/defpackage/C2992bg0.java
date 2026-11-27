package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2992bg0 implements InterfaceC6606sf0<Object> {
    public final /* synthetic */ AW1 d;
    public final /* synthetic */ C3027bp1 e;

    /* JADX INFO: renamed from: bg0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", l = {139}, m = "emit")
    public static final class a extends LM {
        public C2992bg0 d;
        public /* synthetic */ Object e;
        public int g;
        public Object i;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return C2992bg0.this.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2992bg0(Function2 function2, C3027bp1 c3027bp1) {
        this.d = (AW1) function2;
        this.e = c3027bp1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [AW1, kotlin.jvm.functions.Function2] */
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
    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(Object obj, @NotNull JM<? super Unit> jm) {
        a aVar;
        C2992bg0 c2992bg0;
        T t;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.g = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object objInvoke = aVar.e;
        MN mn = MN.d;
        int i2 = aVar.g;
        if (i2 == 0) {
            C1795Pt1.b(objInvoke);
            aVar.d = this;
            aVar.i = obj;
            aVar.g = 1;
            objInvoke = this.d.invoke(obj, aVar);
            if (objInvoke == mn) {
                return mn;
            }
            c2992bg0 = this;
            t = obj;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = aVar.i;
            c2992bg0 = aVar.d;
            C1795Pt1.b(objInvoke);
            t = obj2;
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Unit.a;
        }
        c2992bg0.e.d = t;
        throw new C7306w(c2992bg0);
    }
}
