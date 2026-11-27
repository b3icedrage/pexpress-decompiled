package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.Unit;

/* JADX INFO: renamed from: pv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6032pv extends WM.a {
    public boolean a;

    /* JADX INFO: renamed from: pv$a */
    public static final class a implements WM<AbstractC1091Gt1, AbstractC1091Gt1> {
        public static final a a = new a();

        @Override // defpackage.WM
        public final AbstractC1091Gt1 a(AbstractC1091Gt1 abstractC1091Gt1) {
            AbstractC1091Gt1 abstractC1091Gt2 = abstractC1091Gt1;
            try {
                return Dc2.a(abstractC1091Gt2);
            } finally {
                abstractC1091Gt2.close();
            }
        }
    }

    /* JADX INFO: renamed from: pv$b */
    public static final class b implements WM<AbstractC5395ms1, AbstractC5395ms1> {
        public static final b a = new b();

        @Override // defpackage.WM
        public final AbstractC5395ms1 a(AbstractC5395ms1 abstractC5395ms1) {
            return abstractC5395ms1;
        }
    }

    /* JADX INFO: renamed from: pv$c */
    public static final class c implements WM<AbstractC1091Gt1, AbstractC1091Gt1> {
        public static final c a = new c();

        @Override // defpackage.WM
        public final AbstractC1091Gt1 a(AbstractC1091Gt1 abstractC1091Gt1) {
            return abstractC1091Gt1;
        }
    }

    /* JADX INFO: renamed from: pv$d */
    public static final class d implements WM<Object, String> {
        public static final d a = new d();

        @Override // defpackage.WM
        public final String a(Object obj) {
            return obj.toString();
        }
    }

    /* JADX INFO: renamed from: pv$e */
    public static final class e implements WM<AbstractC1091Gt1, Unit> {
        public static final e a = new e();

        @Override // defpackage.WM
        public final Unit a(AbstractC1091Gt1 abstractC1091Gt1) {
            abstractC1091Gt1.close();
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: pv$f */
    public static final class f implements WM<AbstractC1091Gt1, Void> {
        public static final f a = new f();

        @Override // defpackage.WM
        public final Void a(AbstractC1091Gt1 abstractC1091Gt1) {
            abstractC1091Gt1.close();
            return null;
        }
    }

    @Override // WM.a
    @Nullable
    public final WM<?, AbstractC5395ms1> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C2263Vt1 c2263Vt1) {
        if (AbstractC5395ms1.class.isAssignableFrom(Dc2.f(type))) {
            return b.a;
        }
        return null;
    }

    @Override // WM.a
    @Nullable
    public final WM<AbstractC1091Gt1, ?> b(Type type, Annotation[] annotationArr, C2263Vt1 c2263Vt1) {
        if (type == AbstractC1091Gt1.class) {
            return Dc2.i(annotationArr, InterfaceC3154cS1.class) ? c.a : a.a;
        }
        if (type == Void.class) {
            return f.a;
        }
        if (!this.a || type != Unit.class) {
            return null;
        }
        try {
            return e.a;
        } catch (NoClassDefFoundError unused) {
            this.a = false;
            return null;
        }
    }
}
