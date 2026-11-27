package defpackage;

import androidx.fragment.app.Fragment;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: j90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4612j90 {

    @NotNull
    public final C1621Nn1 A;

    @NotNull
    public final C6120qK1 B;

    @NotNull
    public final C1621Nn1 C;

    @NotNull
    public final C6120qK1 D;

    @NotNull
    public final C1621Nn1 E;

    @NotNull
    public final C6120qK1 F;

    @NotNull
    public final C6120qK1 G;

    @NotNull
    public final C6120qK1 H;

    @NotNull
    public final GP1 a;

    @NotNull
    public final C1699On1 b;

    @NotNull
    public final GP1 c;

    @NotNull
    public final C1699On1 d;

    @NotNull
    public final C6120qK1 e;

    @NotNull
    public final C1621Nn1 f;

    @NotNull
    public final GP1 g;

    @NotNull
    public final GP1 h;

    @NotNull
    public final C1699On1 i;

    @NotNull
    public final GP1 j;

    @NotNull
    public final C1699On1 k;

    @NotNull
    public final GP1 l;

    @NotNull
    public final C1699On1 m;

    @NotNull
    public final GP1 n;

    @NotNull
    public final GP1 o;

    @NotNull
    public final GP1 p;

    @NotNull
    public final C1699On1 q;

    @NotNull
    public final InterfaceC6396rf0<C2177Ur> r;

    @NotNull
    public final C6120qK1 s;

    @NotNull
    public final C6120qK1 t;

    @NotNull
    public final C1621Nn1 u;

    @NotNull
    public final GP1 v;

    @NotNull
    public final C1699On1 w;

    @NotNull
    public final GP1 x;

    @NotNull
    public final C1699On1 y;

    @NotNull
    public final C6120qK1 z;

    /* JADX INFO: renamed from: j90$a */
    public static final class a<T> {
        public final T a;

        public a(T t) {
            this.a = t;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: j90$b */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final /* synthetic */ b[] g;

        static {
            b bVar = new b("REGISTERED", 0);
            d = bVar;
            b bVar2 = new b("ALL_DATA_LOADED", 1);
            e = bVar2;
            b[] bVarArr = {bVar, bVar2};
            g = bVarArr;
            C1952Ru.i(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) g.clone();
        }
    }

    /* JADX INFO: renamed from: j90$c */
    public static final class c implements InterfaceC6396rf0<C2177Ur> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: j90$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: j90$c$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.api.core.EventsFlowsProvider$special$$inlined$map$1$2", f = "EventsFlowsProvider.kt", l = {219}, m = "emit")
            public static final class C0409a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0409a(JM jm) {
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
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0409a c0409a;
                if (jm instanceof C0409a) {
                    c0409a = (C0409a) jm;
                    int i = c0409a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0409a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0409a = new C0409a(jm);
                    }
                } else {
                    c0409a = new C0409a(jm);
                }
                Object obj2 = c0409a.d;
                MN mn = MN.d;
                int i2 = c0409a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Object objM = CollectionsKt.M((Set) obj);
                    c0409a.e = 1;
                    if (this.d.a(objM, c0409a) == mn) {
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

        public c(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super C2177Ur> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    public C4612j90() {
        Boolean bool = Boolean.FALSE;
        GP1 gp1I = C1589Ne.i(bool);
        this.a = gp1I;
        this.b = C4466ii.f(gp1I);
        GP1 gp1I2 = C1589Ne.i(null);
        this.c = gp1I2;
        this.d = C4466ii.f(gp1I2);
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.e = c6120qK1G;
        this.f = C4466ii.e(c6120qK1G);
        GP1 gp1I3 = C1589Ne.i(null);
        this.g = gp1I3;
        C4466ii.f(gp1I3);
        GP1 gp1I4 = C1589Ne.i(bool);
        this.h = gp1I4;
        this.i = C4466ii.f(gp1I4);
        GP1 gp1I5 = C1589Ne.i(bool);
        this.j = gp1I5;
        this.k = C4466ii.f(gp1I5);
        GP1 gp1I6 = C1589Ne.i(bool);
        this.l = gp1I6;
        this.m = C4466ii.f(gp1I6);
        GP1 gp1I7 = C1589Ne.i(bool);
        this.n = gp1I7;
        C4466ii.f(gp1I7);
        GP1 gp1I8 = C1589Ne.i(C6702t60.d);
        this.o = gp1I8;
        GP1 gp1I9 = C1589Ne.i(bool);
        this.p = gp1I9;
        this.q = C4466ii.f(gp1I9);
        this.r = C4466ii.m(new c(gp1I8));
        C6120qK1 c6120qK1G2 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.s = c6120qK1G2;
        C4466ii.e(c6120qK1G2);
        C6120qK1 c6120qK1G3 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.t = c6120qK1G3;
        this.u = C4466ii.e(c6120qK1G3);
        GP1 gp1I10 = C1589Ne.i(null);
        this.v = gp1I10;
        this.w = C4466ii.f(gp1I10);
        GP1 gp1I11 = C1589Ne.i(null);
        this.x = gp1I11;
        this.y = C4466ii.f(gp1I11);
        C6120qK1 c6120qK1G4 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.z = c6120qK1G4;
        this.A = C4466ii.e(c6120qK1G4);
        C6120qK1 c6120qK1G5 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.B = c6120qK1G5;
        this.C = C4466ii.e(c6120qK1G5);
        C6120qK1 c6120qK1G6 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.D = c6120qK1G6;
        this.E = C4466ii.e(c6120qK1G6);
        C4466ii.e(C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d));
        C6120qK1 c6120qK1G7 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.F = c6120qK1G7;
        C4466ii.e(c6120qK1G7);
        C6120qK1 c6120qK1G8 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.G = c6120qK1G8;
        C4466ii.e(c6120qK1G8);
        C6120qK1 c6120qK1G9 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.H = c6120qK1G9;
        C4466ii.e(c6120qK1G9);
    }

    public final void a() {
        this.c.setValue(null);
        Boolean bool = Boolean.FALSE;
        GP1 gp1 = this.h;
        gp1.getClass();
        gp1.m(null, bool);
        GP1 gp2 = this.j;
        gp2.getClass();
        gp2.m(null, bool);
        GP1 gp3 = this.l;
        gp3.getClass();
        gp3.m(null, bool);
        this.v.setValue(null);
    }

    public final void b(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GP1 gp1 = this.x;
        this.v.setValue(gp1.getValue());
        gp1.setValue(fragment);
    }
}
