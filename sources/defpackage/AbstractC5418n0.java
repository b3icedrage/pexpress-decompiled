package defpackage;

import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5418n0 extends AbstractC7317w21 implements GG0 {

    @NotNull
    public final AbstractC5267mG0 c;

    @NotNull
    public final C7577xG0 d;

    public AbstractC5418n0(AbstractC5267mG0 abstractC5267mG0) {
        this.c = abstractC5267mG0;
        this.d = abstractC5267mG0.a;
    }

    @Override // defpackage.AbstractC5106lX1
    public final boolean F(String str) {
        Boolean bool;
        String tag = str;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonPrimitive jsonPrimitiveW = W(tag);
        try {
            C6508sA0 c6508sA0 = MG0.a;
            Intrinsics.checkNotNullParameter(jsonPrimitiveW, "<this>");
            String strB = jsonPrimitiveW.b();
            String[] strArr = C5934pS1.a;
            Intrinsics.checkNotNullParameter(strB, "<this>");
            if (d.i(strB, "true")) {
                bool = Boolean.TRUE;
            } else {
                bool = d.i(strB, "false") ? Boolean.FALSE : null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            Y("boolean");
            throw null;
        } catch (IllegalArgumentException unused) {
            Y("boolean");
            throw null;
        }
    }

    @Override // defpackage.AbstractC5106lX1
    public final byte G(String str) {
        String tag = str;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int iA = MG0.a(W(tag));
            Byte bValueOf = (-128 > iA || iA > 127) ? null : Byte.valueOf((byte) iA);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            Y("byte");
            throw null;
        } catch (IllegalArgumentException unused) {
            Y("byte");
            throw null;
        }
    }

    @Override // defpackage.AbstractC5106lX1
    public final char H(String str) {
        String tag = str;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            String strB = W(tag).b();
            Intrinsics.checkNotNullParameter(strB, "<this>");
            int length = strB.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strB.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            Y("char");
            throw null;
        }
    }

    @Override // defpackage.AbstractC5106lX1
    public final double I(String str) {
        String tag = str;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonPrimitive jsonPrimitiveW = W(tag);
        try {
            C6508sA0 c6508sA0 = MG0.a;
            Intrinsics.checkNotNullParameter(jsonPrimitiveW, "<this>");
            double d = Double.parseDouble(jsonPrimitiveW.b());
            if (this.c.a.h || !(Double.isInfinite(d) || Double.isNaN(d))) {
                return d;
            }
            throw C1874Qu.a(Double.valueOf(d), tag, V().toString());
        } catch (IllegalArgumentException unused) {
            Y("double");
            throw null;
        }
    }

    @Override // defpackage.AbstractC5106lX1
    public final int J(String str, MH1 enumDescriptor) {
        String tag = str;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return C4847kH0.b(enumDescriptor, this.c, W(tag).b(), "");
    }

    @Override // defpackage.AbstractC5106lX1
    public final float K(String str) {
        String tag = str;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonPrimitive jsonPrimitiveW = W(tag);
        try {
            C6508sA0 c6508sA0 = MG0.a;
            Intrinsics.checkNotNullParameter(jsonPrimitiveW, "<this>");
            float f = Float.parseFloat(jsonPrimitiveW.b());
            if (this.c.a.h || !(Float.isInfinite(f) || Float.isNaN(f))) {
                return f;
            }
            throw C1874Qu.a(Float.valueOf(f), tag, V().toString());
        } catch (IllegalArgumentException unused) {
            Y("float");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.AbstractC5106lX1
    public final InterfaceC7828yU L(String str, MH1 inlineDescriptor) {
        String tag = str;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (C3993gS1.a(inlineDescriptor)) {
            return new HG0(new C5304mS1(W(tag).b()), this.c);
        }
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        this.a.add((Tag) tag);
        return this;
    }

    @Override // defpackage.AbstractC5106lX1
    public final int M(String str) {
        String tag = str;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return MG0.a(W(tag));
        } catch (IllegalArgumentException unused) {
            Y("int");
            throw null;
        }
    }

    @Override // defpackage.AbstractC5106lX1
    public final long N(String str) {
        String tag = str;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonPrimitive jsonPrimitiveW = W(tag);
        try {
            C6508sA0 c6508sA0 = MG0.a;
            Intrinsics.checkNotNullParameter(jsonPrimitiveW, "<this>");
            try {
                return new C5304mS1(jsonPrimitiveW.b()).i();
            } catch (IG0 e) {
                throw new NumberFormatException(e.getMessage());
            }
        } catch (IllegalArgumentException unused) {
            Y("long");
            throw null;
        }
    }

    @Override // defpackage.AbstractC5106lX1
    public final short O(String str) {
        String tag = str;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int iA = MG0.a(W(tag));
            Short shValueOf = (-32768 > iA || iA > 32767) ? null : Short.valueOf((short) iA);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            Y("short");
            throw null;
        } catch (IllegalArgumentException unused) {
            Y("short");
            throw null;
        }
    }

    @Override // defpackage.AbstractC5106lX1
    public final String P(String str) {
        String tag = str;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonPrimitive jsonPrimitiveW = W(tag);
        if (!this.c.a.c) {
            C3959gH0 c3959gH0 = jsonPrimitiveW instanceof C3959gH0 ? (C3959gH0) jsonPrimitiveW : null;
            if (c3959gH0 == null) {
                throw C1874Qu.d(-1, "Unexpected 'null' literal when non-nullable string was expected");
            }
            if (!c3959gH0.d) {
                throw C1874Qu.e(C1039Gc0.d("String literal for key '", tag, "' should be quoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON."), V().toString(), -1);
            }
        }
        if (jsonPrimitiveW instanceof JsonNull) {
            throw C1874Qu.e("Unexpected 'null' value instead of string literal", V().toString(), -1);
        }
        return jsonPrimitiveW.b();
    }

    @NotNull
    public abstract JsonElement U(@NotNull String str);

    @NotNull
    public final JsonElement V() {
        JsonElement jsonElementU;
        String str = (String) CollectionsKt.N(this.a);
        return (str == null || (jsonElementU = U(str)) == null) ? X() : jsonElementU;
    }

    @NotNull
    public final JsonPrimitive W(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementU = U(tag);
        JsonPrimitive jsonPrimitive = jsonElementU instanceof JsonPrimitive ? (JsonPrimitive) jsonElementU : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw C1874Qu.e("Expected JsonPrimitive at " + tag + ", found " + jsonElementU, V().toString(), -1);
    }

    @NotNull
    public abstract JsonElement X();

    public final void Y(String str) {
        throw C1874Qu.e(C1039Gc0.d("Failed to parse literal as '", str, "' value"), V().toString(), -1);
    }

    @Override // defpackage.EH
    @NotNull
    public final G1 a() {
        return this.c.b;
    }

    public void b(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // defpackage.InterfaceC7828yU
    @NotNull
    public EH c(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonElement jsonElementV = V();
        VH1 vh1H = descriptor.h();
        boolean z = Intrinsics.a(vh1H, RS1.b.a) ? true : vh1H instanceof AbstractC7448wf1;
        AbstractC5267mG0 abstractC5267mG0 = this.c;
        if (z) {
            if (jsonElementV instanceof JsonArray) {
                return new LH0(abstractC5267mG0, (JsonArray) jsonElementV);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            C2251Vp1 c2251Vp1 = C2017Sp1.a;
            sb.append(c2251Vp1.b(JsonArray.class));
            sb.append(" as the serialized body of ");
            sb.append(descriptor.a());
            sb.append(", but had ");
            sb.append(c2251Vp1.b(jsonElementV.getClass()));
            throw C1874Qu.d(-1, sb.toString());
        }
        if (!Intrinsics.a(vh1H, RS1.c.a)) {
            if (jsonElementV instanceof JsonObject) {
                return new KH0(abstractC5267mG0, (JsonObject) jsonElementV, null, null);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            C2251Vp1 c2251Vp2 = C2017Sp1.a;
            sb2.append(c2251Vp2.b(JsonObject.class));
            sb2.append(" as the serialized body of ");
            sb2.append(descriptor.a());
            sb2.append(", but had ");
            sb2.append(c2251Vp2.b(jsonElementV.getClass()));
            throw C1874Qu.d(-1, sb2.toString());
        }
        MH1 mh1A = C4062gl2.a(descriptor.i(0), abstractC5267mG0.b);
        VH1 vh1H2 = mh1A.h();
        if ((vh1H2 instanceof AbstractC5356mh1) || Intrinsics.a(vh1H2, VH1.b.a)) {
            if (jsonElementV instanceof JsonObject) {
                return new MH0(abstractC5267mG0, (JsonObject) jsonElementV);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            C2251Vp1 c2251Vp3 = C2017Sp1.a;
            sb3.append(c2251Vp3.b(JsonObject.class));
            sb3.append(" as the serialized body of ");
            sb3.append(descriptor.a());
            sb3.append(", but had ");
            sb3.append(c2251Vp3.b(jsonElementV.getClass()));
            throw C1874Qu.d(-1, sb3.toString());
        }
        if (!abstractC5267mG0.a.d) {
            throw C1874Qu.c(mh1A);
        }
        if (jsonElementV instanceof JsonArray) {
            return new LH0(abstractC5267mG0, (JsonArray) jsonElementV);
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        C2251Vp1 c2251Vp4 = C2017Sp1.a;
        sb4.append(c2251Vp4.b(JsonArray.class));
        sb4.append(" as the serialized body of ");
        sb4.append(descriptor.a());
        sb4.append(", but had ");
        sb4.append(c2251Vp4.b(jsonElementV.getClass()));
        throw C1874Qu.d(-1, sb4.toString());
    }

    @Override // defpackage.AbstractC5106lX1, defpackage.InterfaceC7828yU
    public final <T> T d(@NotNull RJ0 deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) C7658xf1.b(this, deserializer);
    }

    @Override // defpackage.GG0
    @NotNull
    public final JsonElement l() {
        return V();
    }

    @Override // defpackage.AbstractC5106lX1, defpackage.InterfaceC7828yU
    @NotNull
    public final InterfaceC7828yU q(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (CollectionsKt.N(this.a) != null) {
            return super.q(descriptor);
        }
        return new C6949uH0(this.c, X()).q(descriptor);
    }

    @Override // defpackage.InterfaceC7828yU
    public boolean w() {
        return !(V() instanceof JsonNull);
    }

    @Override // defpackage.GG0
    @NotNull
    public final AbstractC5267mG0 x() {
        return this.c;
    }
}
