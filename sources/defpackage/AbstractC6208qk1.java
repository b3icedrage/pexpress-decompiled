package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6208qk1 {

    @NotNull
    public final InterfaceC5848p21 a;

    @NotNull
    public final C2656a72 b;

    @Nullable
    public final VN1 c;

    /* JADX INFO: renamed from: qk1$a */
    public static final class a extends AbstractC6208qk1 {

        @NotNull
        public final C2077Tj1 d;

        @Nullable
        public final a e;

        @NotNull
        public final QC f;

        @NotNull
        public final C2077Tj1.c g;
        public final boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C2077Tj1 classProto, @NotNull InterfaceC5848p21 nameResolver, @NotNull C2656a72 typeTable, @Nullable VN1 vn1, @Nullable a aVar) {
            super(nameResolver, typeTable, vn1);
            Intrinsics.checkNotNullParameter(classProto, "classProto");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.d = classProto;
            this.e = aVar;
            this.f = C6267r21.a(nameResolver, classProto.i);
            C2077Tj1.c cVar = (C2077Tj1.c) C2061Te0.f.c(classProto.h);
            this.g = cVar == null ? C2077Tj1.c.CLASS : cVar;
            this.h = C1742Pc.f(C2061Te0.g, classProto.h, "get(...)");
            Intrinsics.checkNotNullExpressionValue(C2061Te0.h.c(classProto.h), "get(...)");
        }

        @Override // defpackage.AbstractC6208qk1
        @NotNull
        public final C1758Ph0 a() {
            return this.f.a();
        }
    }

    /* JADX INFO: renamed from: qk1$b */
    public static final class b extends AbstractC6208qk1 {

        @NotNull
        public final C1758Ph0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C1758Ph0 fqName, @NotNull InterfaceC5848p21 nameResolver, @NotNull C2656a72 typeTable, @Nullable BI0 bi0) {
            super(nameResolver, typeTable, bi0);
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.d = fqName;
        }

        @Override // defpackage.AbstractC6208qk1
        @NotNull
        public final C1758Ph0 a() {
            return this.d;
        }
    }

    public AbstractC6208qk1(InterfaceC5848p21 interfaceC5848p21, C2656a72 c2656a72, VN1 vn1) {
        this.a = interfaceC5848p21;
        this.b = c2656a72;
        this.c = vn1;
    }

    @NotNull
    public abstract C1758Ph0 a();

    @NotNull
    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
