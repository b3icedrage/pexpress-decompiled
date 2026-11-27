package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class NQ {

    @NotNull
    public final InterfaceC6396rf0<C2846az0> a;

    @NotNull
    public final InterfaceC6396rf0<C1491Lx0> b;

    @NotNull
    public final InterfaceC6396rf0<InterfaceC7722xy0<?>> c;

    public static final class a implements InterfaceC6396rf0<C2846az0> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        /* JADX INFO: renamed from: NQ$a$a, reason: collision with other inner class name */
        public static final class C0101a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: NQ$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.api.feature.trading.providers.CurrentIndicatorProvider$special$$inlined$map$1$2", f = "CurrentIndicatorProvider.kt", l = {219}, m = "emit")
            public static final class C0102a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0102a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0101a.this.a(null, this);
                }
            }

            public C0101a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
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
                C0102a c0102a;
                T next;
                if (jm instanceof C0102a) {
                    c0102a = (C0102a) jm;
                    int i = c0102a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0102a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0102a = new C0102a(jm);
                    }
                } else {
                    c0102a = new C0102a(jm);
                }
                Object obj2 = c0102a.d;
                MN mn = MN.d;
                int i2 = c0102a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Iterator<T> it = ((List) obj).iterator();
                    do {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                    } while (!((C2846az0) next).a.k);
                    c0102a.e = 1;
                    if (this.d.a(next, c0102a) == mn) {
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

        public a(InterfaceC6396rf0 interfaceC6396rf0) {
            this.d = interfaceC6396rf0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super C2846az0> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0101a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public static final class b implements InterfaceC6396rf0<C1491Lx0> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: NQ$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.api.feature.trading.providers.CurrentIndicatorProvider$special$$inlined$mapNotNull$1$2", f = "CurrentIndicatorProvider.kt", l = {221}, m = "emit")
            public static final class C0103a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0103a(JM jm) {
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

            public a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0103a c0103a;
                if (jm instanceof C0103a) {
                    c0103a = (C0103a) jm;
                    int i = c0103a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0103a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0103a = new C0103a(jm);
                    }
                } else {
                    c0103a = new C0103a(jm);
                }
                Object obj2 = c0103a.d;
                MN mn = MN.d;
                int i2 = c0103a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C2846az0 c2846az0 = (C2846az0) obj;
                    C1491Lx0 c1491Lx0 = c2846az0 != null ? c2846az0.a : null;
                    if (c1491Lx0 != null) {
                        c0103a.e = 1;
                        if (this.d.a(c1491Lx0, c0103a) == mn) {
                            return mn;
                        }
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

        public b(InterfaceC6396rf0 interfaceC6396rf0) {
            this.d = interfaceC6396rf0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super C1491Lx0> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public NQ(@NotNull C3051bx1 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        InterfaceC6396rf0<C2846az0> interfaceC6396rf0M = C4466ii.m(new a(provider.f));
        this.a = interfaceC6396rf0M;
        this.b = C4466ii.m(new b(interfaceC6396rf0M));
        this.c = provider.h;
    }
}
