package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: js, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4760js extends I<InterfaceC1583Nc, CK<?>> {

    @NotNull
    public final T01 c;

    @NotNull
    public final G51 d;

    @NotNull
    public final C1820Qc e;

    @NotNull
    public C7793yI0 f;

    /* JADX INFO: renamed from: js$a */
    public abstract class a implements InterfaceC2699aL0.a {

        /* JADX INFO: renamed from: js$a$a, reason: collision with other inner class name */
        public static final class C0421a implements InterfaceC2699aL0.a {
            public final /* synthetic */ C4970ks a;
            public final /* synthetic */ C4970ks b;
            public final /* synthetic */ a c;
            public final /* synthetic */ C5638o21 d;
            public final /* synthetic */ ArrayList<InterfaceC1583Nc> e;

            public C0421a(C4970ks c4970ks, a aVar, C5638o21 c5638o21, ArrayList arrayList) {
                this.b = c4970ks;
                this.c = aVar;
                this.d = c5638o21;
                this.e = arrayList;
                this.a = c4970ks;
            }

            @Override // defpackage.InterfaceC2699aL0.a
            public final void a() {
                this.b.a();
                C2292Wc c2292Wc = new C2292Wc((InterfaceC1583Nc) CollectionsKt.U(this.e));
                this.c.g(this.d, c2292Wc);
            }

            @Override // defpackage.InterfaceC2699aL0.a
            public final void b(C5638o21 c5638o21, Object obj) {
                this.a.b(c5638o21, obj);
            }

            @Override // defpackage.InterfaceC2699aL0.a
            public final void c(C5638o21 c5638o21, TC value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.a.c(c5638o21, value);
            }

            @Override // defpackage.InterfaceC2699aL0.a
            public final InterfaceC2699aL0.b d(C5638o21 c5638o21) {
                return this.a.d(c5638o21);
            }

            @Override // defpackage.InterfaceC2699aL0.a
            public final void e(C5638o21 c5638o21, QC enumClassId, C5638o21 enumEntryName) {
                Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
                Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
                this.a.e(c5638o21, enumClassId, enumEntryName);
            }

            @Override // defpackage.InterfaceC2699aL0.a
            public final InterfaceC2699aL0.a f(QC classId, C5638o21 c5638o21) {
                Intrinsics.checkNotNullParameter(classId, "classId");
                return this.a.f(classId, c5638o21);
            }
        }

        /* JADX INFO: renamed from: js$a$b */
        public static final class b implements InterfaceC2699aL0.b {
            public final ArrayList<CK<?>> a = new ArrayList<>();
            public final /* synthetic */ C4760js b;
            public final /* synthetic */ C5638o21 c;
            public final /* synthetic */ a d;

            /* JADX INFO: renamed from: js$a$b$a, reason: collision with other inner class name */
            public static final class C0422a implements InterfaceC2699aL0.a {
                public final /* synthetic */ C4970ks a;
                public final /* synthetic */ C4970ks b;
                public final /* synthetic */ b c;
                public final /* synthetic */ ArrayList<InterfaceC1583Nc> d;

                public C0422a(C4970ks c4970ks, b bVar, ArrayList arrayList) {
                    this.b = c4970ks;
                    this.c = bVar;
                    this.d = arrayList;
                    this.a = c4970ks;
                }

                @Override // defpackage.InterfaceC2699aL0.a
                public final void a() {
                    this.b.a();
                    this.c.a.add(new C2292Wc((InterfaceC1583Nc) CollectionsKt.U(this.d)));
                }

                @Override // defpackage.InterfaceC2699aL0.a
                public final void b(C5638o21 c5638o21, Object obj) {
                    this.a.b(c5638o21, obj);
                }

                @Override // defpackage.InterfaceC2699aL0.a
                public final void c(C5638o21 c5638o21, TC value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.a.c(c5638o21, value);
                }

                @Override // defpackage.InterfaceC2699aL0.a
                public final InterfaceC2699aL0.b d(C5638o21 c5638o21) {
                    return this.a.d(c5638o21);
                }

                @Override // defpackage.InterfaceC2699aL0.a
                public final void e(C5638o21 c5638o21, QC enumClassId, C5638o21 enumEntryName) {
                    Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
                    Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
                    this.a.e(c5638o21, enumClassId, enumEntryName);
                }

                @Override // defpackage.InterfaceC2699aL0.a
                public final InterfaceC2699aL0.a f(QC classId, C5638o21 c5638o21) {
                    Intrinsics.checkNotNullParameter(classId, "classId");
                    return this.a.f(classId, c5638o21);
                }
            }

            public b(C4760js c4760js, C5638o21 c5638o21, a aVar) {
                this.b = c4760js;
                this.c = c5638o21;
                this.d = aVar;
            }

            @Override // defpackage.InterfaceC2699aL0.b
            public final void a() {
                ArrayList<CK<?>> elements = this.a;
                C4970ks c4970ks = (C4970ks) this.d;
                c4970ks.getClass();
                Intrinsics.checkNotNullParameter(elements, "elements");
                C5638o21 c5638o21 = this.c;
                Xc2 xc2M = UE.m(c5638o21, c4970ks.d);
                if (xc2M != null) {
                    HashMap<C5638o21, CK<?>> map = c4970ks.b;
                    List value = UE.f(elements);
                    AbstractC4649jL0 type = xc2M.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(type, "type");
                    map.put(c5638o21, new C4348i72(value, type));
                    return;
                }
                if (c4970ks.c.o(c4970ks.e) && Intrinsics.a(c5638o21.e(), AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    ArrayList arrayList = new ArrayList();
                    for (CK<?> ck : elements) {
                        if (ck instanceof C2292Wc) {
                            arrayList.add(ck);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        c4970ks.f.add((InterfaceC1583Nc) ((C2292Wc) it.next()).a);
                    }
                }
            }

            @Override // defpackage.InterfaceC2699aL0.b
            public final InterfaceC2699aL0.a b(QC classId) {
                Intrinsics.checkNotNullParameter(classId, "classId");
                ArrayList arrayList = new ArrayList();
                VN1.a NO_SOURCE = VN1.a;
                Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
                C4970ks c4970ksP = this.b.p(classId, NO_SOURCE, arrayList);
                Intrinsics.checkNotNull(c4970ksP);
                return new C0422a(c4970ksP, this, arrayList);
            }

            @Override // defpackage.InterfaceC2699aL0.b
            public final void c(Object obj) {
                this.a.add(C4760js.t(this.b, this.c, obj));
            }

            @Override // defpackage.InterfaceC2699aL0.b
            public final void d(QC enumClassId, C5638o21 enumEntryName) {
                Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
                Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
                this.a.add(new C6286r70(enumClassId, enumEntryName));
            }

            @Override // defpackage.InterfaceC2699aL0.b
            public final void e(TC value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.a.add(new C3965gJ0(value));
            }
        }

        public a() {
        }

        @Override // defpackage.InterfaceC2699aL0.a
        public final void b(@Nullable C5638o21 c5638o21, @Nullable Object obj) {
            g(c5638o21, C4760js.t(C4760js.this, c5638o21, obj));
        }

        @Override // defpackage.InterfaceC2699aL0.a
        public final void c(@Nullable C5638o21 c5638o21, @NotNull TC value) {
            Intrinsics.checkNotNullParameter(value, "value");
            g(c5638o21, new C3965gJ0(value));
        }

        @Override // defpackage.InterfaceC2699aL0.a
        @Nullable
        public final InterfaceC2699aL0.b d(@Nullable C5638o21 c5638o21) {
            return new b(C4760js.this, c5638o21, this);
        }

        @Override // defpackage.InterfaceC2699aL0.a
        public final void e(@Nullable C5638o21 c5638o21, @NotNull QC enumClassId, @NotNull C5638o21 enumEntryName) {
            Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
            Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
            g(c5638o21, new C6286r70(enumClassId, enumEntryName));
        }

        @Override // defpackage.InterfaceC2699aL0.a
        @Nullable
        public final InterfaceC2699aL0.a f(@NotNull QC classId, @Nullable C5638o21 c5638o21) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            ArrayList arrayList = new ArrayList();
            VN1.a NO_SOURCE = VN1.a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            C4970ks c4970ksP = C4760js.this.p(classId, NO_SOURCE, arrayList);
            Intrinsics.checkNotNull(c4970ksP);
            return new C0421a(c4970ksP, this, c5638o21, arrayList);
        }

        public abstract void g(@Nullable C5638o21 c5638o21, @NotNull CK<?> ck);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4760js(@NotNull T01 module, @NotNull G51 notFoundClasses, @NotNull C2720aS0 storageManager, @NotNull C1705Op1 kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.c = module;
        this.d = notFoundClasses;
        this.e = new C1820Qc(module, notFoundClasses);
        this.f = C7793yI0.g;
    }

    public static final CK t(C4760js c4760js, C5638o21 c5638o21, Object obj) {
        CK ckL = UE.b.l(obj, c4760js.c);
        if (ckL != null) {
            return ckL;
        }
        String message = "Unsupported annotation argument: " + c5638o21;
        Intrinsics.checkNotNullParameter(message, "message");
        return new S70.a(message);
    }

    @Override // defpackage.J
    @Nullable
    public final C4970ks p(@NotNull QC annotationClassId, @NotNull VN1 source, @NotNull List result) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        return new C4970ks(this, C7859yd0.c(this.c, annotationClassId, this.d), annotationClassId, result, source);
    }
}
