package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.pexpress.tool.R;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5358mi {

    @NotNull
    public final Activity a;

    @NotNull
    public final AbstractC4394iM0 b;

    @NotNull
    public final InterfaceC1446Li c;

    @NotNull
    public final InterfaceC3208ci d;

    @NotNull
    public final GP1 e;

    @NotNull
    public final C4250hg0 f;

    @NotNull
    public final String g;
    public boolean h;

    /* JADX INFO: renamed from: mi$a */
    public static abstract class a {

        /* JADX INFO: renamed from: mi$a$a, reason: collision with other inner class name */
        public static final class C0443a extends a {

            @NotNull
            public final String a;

            public C0443a(@NotNull String currentVersion) {
                Intrinsics.checkNotNullParameter(currentVersion, "currentVersion");
                this.a = currentVersion;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0443a) && Intrinsics.a(this.a, ((C0443a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @NotNull
            public final String toString() {
                return C5807oq.b(new StringBuilder("NoUpdate(currentVersion="), this.a, ")");
            }
        }

        /* JADX INFO: renamed from: mi$a$b */
        public static final class b extends a {

            @Nullable
            public final String a;

            @NotNull
            public final String b;

            public b(@Nullable String str, @NotNull String newVersion) {
                Intrinsics.checkNotNullParameter(newVersion, "newVersion");
                this.a = str;
                this.b = newVersion;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.a(this.a, bVar.a) && Intrinsics.a(this.b, bVar.b);
            }

            public final int hashCode() {
                String str = this.a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("UpdateAvailable(lastVersion=");
                sb.append(this.a);
                sb.append(", newVersion=");
                return C5807oq.b(sb, this.b, ")");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: mi$b */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final /* synthetic */ b[] g;

        static {
            b bVar = new b("UPDATE_EXIST", 0);
            d = bVar;
            b bVar2 = new b("NO", 1);
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

    /* JADX INFO: renamed from: mi$c */
    @InterfaceC3368dU(c = "com.api.core.AppUpdatesManagerImpl$config$2$1", f = "AppUpdatesManagerImpl.kt", l = {51}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super FF>, Object> {
        public int d;
        public final /* synthetic */ C4923kf e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C4923kf c4923kf, JM<? super c> jm) {
            super(2, jm);
            this.e = c4923kf;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new c(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super FF> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return obj;
            }
            C1795Pt1.b(obj);
            GP1 gp1 = this.e.b;
            this.d = 1;
            Object objA = C7236vf0.a(gp1, this);
            return objA == mn ? mn : objA;
        }
    }

    public C5358mi(@NotNull Context context, @NotNull Activity activity, @NotNull AbstractC4394iM0 lastAppVersionUseCase, @NotNull InterfaceC1446Li applicationVersionProvider, @NotNull C4923kf appDataRepository) {
        C2252Vq c2252Vq;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lastAppVersionUseCase, "lastAppVersionUseCase");
        Intrinsics.checkNotNullParameter(applicationVersionProvider, "applicationVersionProvider");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.a = activity;
        this.b = lastAppVersionUseCase;
        this.c = applicationVersionProvider;
        synchronized (Nm2.class) {
            try {
                if (Nm2.d == null) {
                    Context applicationContext = context.getApplicationContext();
                    Nm2.d = new C2252Vq(new C1602Nh0(applicationContext != null ? applicationContext : context));
                }
                c2252Vq = Nm2.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        InterfaceC3208ci interfaceC3208ci = (InterfaceC3208ci) ((Jm2) c2252Vq.d).zza();
        Intrinsics.checkNotNullExpressionValue(interfaceC3208ci, "create(...)");
        this.d = interfaceC3208ci;
        GP1 gp1I = C1589Ne.i(null);
        this.e = gp1I;
        this.f = new C4250hg0(gp1I, 0);
        this.g = applicationVersionProvider.a();
        XO0.b(new C2767ag(appDataRepository, 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Enum a(@NotNull LM lm) {
        C5568ni c5568ni;
        if (lm instanceof C5568ni) {
            c5568ni = (C5568ni) lm;
            int i = c5568ni.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5568ni.g = i - Integer.MIN_VALUE;
            } else {
                c5568ni = new C5568ni(this, lm);
            }
        } else {
            c5568ni = new C5568ni(this, lm);
        }
        Object objA = c5568ni.d;
        MN mn = MN.d;
        int i2 = c5568ni.g;
        try {
            if (i2 == 0) {
                C1795Pt1.b(objA);
                InterfaceC3208ci interfaceC3208ci = this.d;
                c5568ni.g = 1;
                objA = C4466ii.A(interfaceC3208ci, c5568ni);
                if (objA == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objA);
            }
            C2999bi c2999bi = (C2999bi) objA;
            Objects.toString(c2999bi);
            int i3 = c2999bi.a;
            return (i3 == 2 || i3 == 3) ? b.d : b.e;
        } catch (Exception e) {
            e.toString();
            return b.e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull LM lm) {
        C5778oi c5778oi;
        C5358mi c5358mi;
        if (lm instanceof C5778oi) {
            c5778oi = (C5778oi) lm;
            int i = c5778oi.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5778oi.h = i - Integer.MIN_VALUE;
            } else {
                c5778oi = new C5778oi(this, lm);
            }
        } else {
            c5778oi = new C5778oi(this, lm);
        }
        Object objO = c5778oi.e;
        MN mn = MN.d;
        int i2 = c5778oi.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<String> interfaceC6396rf0K = this.b.k();
            c5778oi.d = this;
            c5778oi.h = 1;
            objO = C4466ii.o(interfaceC6396rf0K, c5778oi);
            if (objO == mn) {
                return mn;
            }
            c5358mi = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5358mi = c5778oi.d;
            C1795Pt1.b(objO);
        }
        String str = (String) objO;
        if (str == null) {
            GP1 gp1 = c5358mi.e;
            a.b bVar = new a.b(null, c5358mi.g);
            gp1.getClass();
            gp1.m(null, bVar);
        } else {
            boolean zK = QO.k(str, c5358mi.g);
            GP1 gp2 = c5358mi.e;
            if (zK) {
                a.b bVar2 = new a.b(str, c5358mi.g);
                gp2.getClass();
                gp2.m(null, bVar2);
            } else {
                a.C0443a c0443a = new a.C0443a(str);
                gp2.getClass();
                gp2.m(null, c0443a);
            }
        }
        Objects.toString(c5358mi.e.getValue());
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull LM lm) {
        C6198qi c6198qi;
        C5358mi c5358mi;
        if (lm instanceof C6198qi) {
            c6198qi = (C6198qi) lm;
            int i = c6198qi.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6198qi.h = i - Integer.MIN_VALUE;
            } else {
                c6198qi = new C6198qi(this, lm);
            }
        } else {
            c6198qi = new C6198qi(this, lm);
        }
        Object objA = c6198qi.e;
        MN mn = MN.d;
        int i2 = c6198qi.h;
        try {
            if (i2 == 0) {
                C1795Pt1.b(objA);
                InterfaceC3208ci interfaceC3208ci = this.d;
                c6198qi.d = this;
                c6198qi.h = 1;
                objA = C4466ii.A(interfaceC3208ci, c6198qi);
                if (objA == mn) {
                    return mn;
                }
                c5358mi = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c5358mi = c6198qi.d;
                C1795Pt1.b(objA);
            }
            C2999bi c2999bi = (C2999bi) objA;
            Objects.toString(c2999bi);
            c5358mi.d.a(c2999bi, c5358mi.a);
            c5358mi.h = true;
        } catch (Exception e) {
            e.toString();
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [PA0, T, li] */
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
    @Nullable
    public final Object d(@NotNull LM lm) {
        C6407ri c6407ri;
        final C5358mi c5358mi;
        if (lm instanceof C6407ri) {
            c6407ri = (C6407ri) lm;
            int i = c6407ri.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6407ri.h = i - Integer.MIN_VALUE;
            } else {
                c6407ri = new C6407ri(this, lm);
            }
        } else {
            c6407ri = new C6407ri(this, lm);
        }
        Object objA = c6407ri.e;
        MN mn = MN.d;
        int i2 = c6407ri.h;
        try {
            if (i2 == 0) {
                C1795Pt1.b(objA);
                InterfaceC3208ci interfaceC3208ci = this.d;
                c6407ri.d = this;
                c6407ri.h = 1;
                objA = C4466ii.A(interfaceC3208ci, c6407ri);
                if (objA == mn) {
                    return mn;
                }
                c5358mi = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c5358mi = c6407ri.d;
                C1795Pt1.b(objA);
            }
            int i3 = ((C2999bi) objA).b;
            boolean z = c5358mi.h;
            InterfaceC3208ci interfaceC3208ci2 = c5358mi.d;
            if (!z || i3 == 11) {
                interfaceC3208ci2.b();
                return Unit.a;
            }
            final C3027bp1 c3027bp1 = new C3027bp1();
            ?? r1 = new PA0() { // from class: li
                @Override // defpackage.QP1
                public final void a(Gm2 installState) {
                    Intrinsics.checkNotNullParameter(installState, "installState");
                    if (installState.c() == 11) {
                        C5358mi c5358mi2 = this.a;
                        boolean z2 = c5358mi2.h;
                        C3027bp1 c3027bp2 = c3027bp1;
                        if (!z2) {
                            PA0 pa0 = (PA0) c3027bp2.d;
                            InterfaceC3208ci interfaceC3208ci3 = c5358mi2.d;
                            if (pa0 != null) {
                                interfaceC3208ci3.e(pa0);
                            }
                            interfaceC3208ci3.b();
                            return;
                        }
                        Activity activity = c5358mi2.a;
                        View viewFindViewById = activity.findViewById(R.id.root);
                        Intrinsics.checkNotNull(viewFindViewById);
                        String string = activity.getString(R.string.update_downloaded_text);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        String string2 = activity.getString(R.string.restart_btn);
                        C4935ki c4935ki = new C4935ki(0, c3027bp2, c5358mi2);
                        View viewFindViewById2 = activity.findViewById(R.id.bottomNavigation);
                        if (viewFindViewById2 == null || viewFindViewById2.getVisibility() != 0) {
                            viewFindViewById2 = null;
                        }
                        Pd2.c(viewFindViewById, string, R.drawable.ic_snackbar_successful_action, string2, c4935ki, viewFindViewById2, -2);
                    }
                }
            };
            c3027bp1.d = r1;
            interfaceC3208ci2.d(r1);
            return Unit.a;
        } catch (Exception e) {
            e.toString();
        }
    }
}
