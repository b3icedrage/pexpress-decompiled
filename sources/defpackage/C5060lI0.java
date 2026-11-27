package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5060lI0 extends RK0 {
    public static final /* synthetic */ IJ0<Object>[] h;

    @Nullable
    public C4640jI0 f;

    @NotNull
    public final I51 g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: lI0$a */
    public static final class a {
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("FROM_DEPENDENCIES", 0);
            d = aVar;
            a[] aVarArr = {aVar, new a("FROM_CLASS_LOADER", 1), new a("FALLBACK", 2)};
            e = aVarArr;
            C1952Ru.i(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    /* JADX INFO: renamed from: lI0$b */
    public static final class b {

        @NotNull
        public final T01 a;

        public b(@NotNull T01 ownerModuleDescriptor) {
            Intrinsics.checkNotNullParameter(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.a = ownerModuleDescriptor;
        }
    }

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        h = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(C5060lI0.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5060lI0(@NotNull C2720aS0 storageManager) {
        super(storageManager);
        a kind = a.d;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.g = new C2720aS0.h(storageManager, new C4382iI0(this, storageManager));
    }

    @NotNull
    public final C5693oI0 K() {
        return (C5693oI0) Nm2.f(this.g, h[0]);
    }

    @Override // defpackage.RK0
    @NotNull
    public final InterfaceC5240m8 d() {
        return K();
    }

    @Override // defpackage.RK0
    public final Iterable l() {
        Iterable<HC> iterableL = super.l();
        Intrinsics.checkNotNullExpressionValue(iterableL, "getClassDescriptorFactories(...)");
        C2720aS0 c2720aS0 = this.d;
        Intrinsics.checkNotNullExpressionValue(c2720aS0, "getStorageManager(...)");
        T01 t01K = k();
        Intrinsics.checkNotNullExpressionValue(t01K, "getBuiltInsModule(...)");
        return CollectionsKt.P(iterableL, new C4172hI0(c2720aS0, t01K));
    }

    @Override // defpackage.RK0
    @NotNull
    public final InterfaceC4033ge1 p() {
        return K();
    }
}
