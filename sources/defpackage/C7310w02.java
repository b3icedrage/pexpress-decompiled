package defpackage;

import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: w02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7310w02 implements InterfaceC6396rf0<List<? extends C6680t02>> {
    public final /* synthetic */ FP1 d;
    public final /* synthetic */ C7521x02 e;

    /* JADX INFO: renamed from: w02$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;
        public final /* synthetic */ C7521x02 e;

        /* JADX INFO: renamed from: w02$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.activation.providers.TopStepsProviderBase$getTopSteps$$inlined$map$1$2", f = "TopStepsProviderBase.kt", l = {219}, m = "emit")
        public static final class C0522a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0522a(JM jm) {
                super(jm);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.d = obj;
                this.e |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(InterfaceC6606sf0 interfaceC6606sf0, C7521x02 c7521x02) {
            this.d = interfaceC6606sf0;
            this.e = c7521x02;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
        public final Object a(Object obj, @NotNull JM jm) {
            C0522a c0522a;
            List list;
            if (jm instanceof C0522a) {
                c0522a = (C0522a) jm;
                int i = c0522a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0522a.e = i - Integer.MIN_VALUE;
                } else {
                    c0522a = new C0522a(jm);
                }
            } else {
                c0522a = new C0522a(jm);
            }
            Object obj2 = c0522a.d;
            MN mn = MN.d;
            int i2 = c0522a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                AbstractC5652o6 abstractC5652o6 = (AbstractC5652o6) obj;
                boolean z = abstractC5652o6 instanceof AbstractC5652o6.b;
                C7521x02 c7521x02 = this.e;
                if (z) {
                    list = c7521x02.c;
                } else {
                    list = abstractC5652o6 instanceof AbstractC5652o6.c ? c7521x02.b : C5653o60.d;
                }
                c0522a.e = 1;
                if (this.d.a(list, c0522a) == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj2);
            }
            return Unit.a;
        }
    }

    public C7310w02(FP1 fp1, C7521x02 c7521x02) {
        this.d = fp1;
        this.e = c7521x02;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super List<? extends C6680t02>> interfaceC6606sf0, @NotNull JM jm) {
        Object objC = this.d.c(new a(interfaceC6606sf0, this.e), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
