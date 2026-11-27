package defpackage;

import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Bn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0683Bn1 implements InterfaceC2699aL0.c {
    public static final boolean i;
    public static final HashMap j;
    public int[] a;
    public String b;
    public int c;
    public String[] d;
    public String[] e;
    public String[] f;
    public UK0.a g;
    public String[] h;

    static {
        try {
            i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            i = false;
        }
        HashMap map = new HashMap();
        j = map;
        map.put(QC.a.b(new C1758Ph0("kotlin.jvm.internal.KotlinClass")), UK0.a.CLASS);
        map.put(QC.a.b(new C1758Ph0("kotlin.jvm.internal.KotlinFileFacade")), UK0.a.FILE_FACADE);
        map.put(QC.a.b(new C1758Ph0("kotlin.jvm.internal.KotlinMultifileClass")), UK0.a.MULTIFILE_CLASS);
        map.put(QC.a.b(new C1758Ph0("kotlin.jvm.internal.KotlinMultifileClassPart")), UK0.a.MULTIFILE_CLASS_PART);
        map.put(QC.a.b(new C1758Ph0("kotlin.jvm.internal.KotlinSyntheticClass")), UK0.a.SYNTHETIC_CLASS);
    }

    @Override // defpackage.InterfaceC2699aL0.c
    @Nullable
    public final InterfaceC2699aL0.a b(@NotNull QC qc, @NotNull C4285hp1 c4285hp1) {
        UK0.a aVar;
        C1758Ph0 c1758Ph0A = qc.a();
        if (c1758Ph0A.equals(C3333dI0.a)) {
            return new b();
        }
        if (c1758Ph0A.equals(C3333dI0.o)) {
            return new c();
        }
        if (i || this.g != null || (aVar = (UK0.a) j.get(qc)) == null) {
            return null;
        }
        this.g = aVar;
        return new d();
    }

    /* JADX INFO: renamed from: Bn1$b */
    public class b implements InterfaceC2699aL0.a {
        public b() {
        }

        @Override // defpackage.InterfaceC2699aL0.a
        public final void b(@Nullable C5638o21 c5638o21, @Nullable Object obj) {
            String strE = c5638o21.e();
            boolean zEquals = "k".equals(strE);
            C0683Bn1 c0683Bn1 = C0683Bn1.this;
            if (zEquals) {
                if (obj instanceof Integer) {
                    UK0.a.e.getClass();
                    UK0.a aVar = (UK0.a) UK0.a.g.get((Integer) obj);
                    if (aVar == null) {
                        aVar = UK0.a.UNKNOWN;
                    }
                    c0683Bn1.g = aVar;
                    return;
                }
                return;
            }
            if ("mv".equals(strE)) {
                if (obj instanceof int[]) {
                    c0683Bn1.a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strE)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    c0683Bn1.b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strE)) {
                if (obj instanceof Integer) {
                    c0683Bn1.c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(strE) && (obj instanceof String) && !((String) obj).isEmpty()) {
                c0683Bn1.getClass();
            }
        }

        @Override // defpackage.InterfaceC2699aL0.a
        @Nullable
        public final InterfaceC2699aL0.b d(@Nullable C5638o21 c5638o21) {
            String strE = c5638o21.e();
            if ("d1".equals(strE)) {
                return new C0761Cn1(this);
            }
            if ("d2".equals(strE)) {
                return new C0839Dn1(this);
            }
            return null;
        }

        @Override // defpackage.InterfaceC2699aL0.a
        @Nullable
        public final InterfaceC2699aL0.a f(@NotNull QC qc, @Nullable C5638o21 c5638o21) {
            return null;
        }

        @Override // defpackage.InterfaceC2699aL0.a
        public final void a() {
        }

        @Override // defpackage.InterfaceC2699aL0.a
        public final void c(@Nullable C5638o21 c5638o21, @NotNull TC tc) {
        }

        @Override // defpackage.InterfaceC2699aL0.a
        public final void e(@Nullable C5638o21 c5638o21, @NotNull QC qc, @NotNull C5638o21 c5638o22) {
        }
    }

    /* JADX INFO: renamed from: Bn1$c */
    public class c implements InterfaceC2699aL0.a {
        public c() {
        }

        @Override // defpackage.InterfaceC2699aL0.a
        @Nullable
        public final InterfaceC2699aL0.b d(@Nullable C5638o21 c5638o21) {
            if ("b".equals(c5638o21.e())) {
                return new C0917En1(this);
            }
            return null;
        }

        @Override // defpackage.InterfaceC2699aL0.a
        @Nullable
        public final InterfaceC2699aL0.a f(@NotNull QC qc, @Nullable C5638o21 c5638o21) {
            return null;
        }

        @Override // defpackage.InterfaceC2699aL0.a
        public final void a() {
        }

        @Override // defpackage.InterfaceC2699aL0.a
        public final void b(@Nullable C5638o21 c5638o21, @Nullable Object obj) {
        }

        @Override // defpackage.InterfaceC2699aL0.a
        public final void c(@Nullable C5638o21 c5638o21, @NotNull TC tc) {
        }

        @Override // defpackage.InterfaceC2699aL0.a
        public final void e(@Nullable C5638o21 c5638o21, @NotNull QC qc, @NotNull C5638o21 c5638o22) {
        }
    }

    /* JADX INFO: renamed from: Bn1$d */
    public class d implements InterfaceC2699aL0.a {
        public d() {
        }

        @Override // defpackage.InterfaceC2699aL0.a
        public final void b(@Nullable C5638o21 c5638o21, @Nullable Object obj) {
            String strE = c5638o21.e();
            boolean zEquals = "version".equals(strE);
            C0683Bn1 c0683Bn1 = C0683Bn1.this;
            if (zEquals) {
                if (obj instanceof int[]) {
                    c0683Bn1.a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strE)) {
                c0683Bn1.b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // defpackage.InterfaceC2699aL0.a
        @Nullable
        public final InterfaceC2699aL0.b d(@Nullable C5638o21 c5638o21) {
            String strE = c5638o21.e();
            if ("data".equals(strE) || "filePartClassNames".equals(strE)) {
                return new C0995Fn1(this);
            }
            if ("strings".equals(strE)) {
                return new C1073Gn1(this);
            }
            return null;
        }

        @Override // defpackage.InterfaceC2699aL0.a
        @Nullable
        public final InterfaceC2699aL0.a f(@NotNull QC qc, @Nullable C5638o21 c5638o21) {
            return null;
        }

        @Override // defpackage.InterfaceC2699aL0.a
        public final void a() {
        }

        @Override // defpackage.InterfaceC2699aL0.a
        public final void c(@Nullable C5638o21 c5638o21, @NotNull TC tc) {
        }

        @Override // defpackage.InterfaceC2699aL0.a
        public final void e(@Nullable C5638o21 c5638o21, @NotNull QC qc, @NotNull C5638o21 c5638o22) {
        }
    }

    @Override // defpackage.InterfaceC2699aL0.c
    public final void a() {
    }

    /* JADX INFO: renamed from: Bn1$a */
    public static abstract class a implements InterfaceC2699aL0.b {
        public final ArrayList a = new ArrayList();

        @Override // defpackage.InterfaceC2699aL0.b
        public final void a() {
            f((String[]) this.a.toArray(new String[0]));
        }

        @Override // defpackage.InterfaceC2699aL0.b
        @Nullable
        public final InterfaceC2699aL0.a b(@NotNull QC qc) {
            return null;
        }

        @Override // defpackage.InterfaceC2699aL0.b
        public final void c(@Nullable Object obj) {
            if (obj instanceof String) {
                this.a.add((String) obj);
            }
        }

        public abstract void f(@NotNull String[] strArr);

        @Override // defpackage.InterfaceC2699aL0.b
        public final void e(@NotNull TC tc) {
        }

        @Override // defpackage.InterfaceC2699aL0.b
        public final void d(@NotNull QC qc, @NotNull C5638o21 c5638o21) {
        }
    }
}
