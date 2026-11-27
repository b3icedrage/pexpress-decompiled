package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.reflect.TypeToken;
import com.impl.core.backend.modelsResponse.AssetDtoDeserializer;
import java.io.IOException;

/* JADX INFO: renamed from: h52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4130h52<T> extends YH1<T> {
    public final DH0<T> a;
    public final LG0<T> b;
    public final Gson c;
    public final TypeToken<T> d;
    public final b e;
    public final C4130h52<T>.a f = new a();
    public final boolean g;
    public volatile T52<T> h;

    /* JADX INFO: renamed from: h52$a */
    public final class a implements JG0 {
    }

    /* JADX INFO: renamed from: h52$b */
    public static final class b implements U52 {
        public final TypeToken<?> d;
        public final boolean e;
        public final DH0<?> g;
        public final LG0<?> h;

        /* JADX WARN: Multi-variable type inference failed */
        public b(AssetDtoDeserializer assetDtoDeserializer, TypeToken typeToken, boolean z) {
            this.g = assetDtoDeserializer instanceof DH0 ? (DH0) assetDtoDeserializer : null;
            this.h = assetDtoDeserializer;
            this.d = typeToken;
            this.e = z;
        }

        @Override // defpackage.U52
        public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
            TypeToken<?> typeToken2 = this.d;
            if (typeToken2 == null) {
                typeToken.getRawType();
                throw null;
            }
            if (typeToken2.equals(typeToken) || (this.e && typeToken2.getType() == typeToken.getRawType())) {
                return new C4130h52(this.g, this.h, gson, typeToken, this, true);
            }
            return null;
        }
    }

    public C4130h52(DH0 dh0, LG0 lg0, Gson gson, TypeToken typeToken, b bVar, boolean z) {
        this.a = dh0;
        this.b = lg0;
        this.c = gson;
        this.d = typeToken;
        this.e = bVar;
        this.g = z;
    }

    @Override // defpackage.T52
    public final T a(C7790yH0 c7790yH0) {
        LG0<T> lg0 = this.b;
        if (lg0 == null) {
            T52<T> t52G = this.h;
            if (t52G == null) {
                t52G = this.c.g(this.e, this.d);
                this.h = t52G;
            }
            return t52G.a(c7790yH0);
        }
        JsonElement jsonElementL = C3057c.l(c7790yH0);
        if (this.g) {
            jsonElementL.getClass();
            if (jsonElementL instanceof JsonNull) {
                return null;
            }
        }
        return (T) lg0.a(jsonElementL, this.d.getType(), this.f);
    }

    @Override // defpackage.T52
    public final void b(ZH0 zh0, T t) throws IOException {
        DH0<T> dh0 = this.a;
        if (dh0 == null) {
            T52<T> t52G = this.h;
            if (t52G == null) {
                t52G = this.c.g(this.e, this.d);
                this.h = t52G;
            }
            t52G.b(zh0, t);
            return;
        }
        if (this.g && t == null) {
            zh0.l();
            return;
        }
        this.d.getType();
        JsonElement jsonElementA = dh0.a();
        W52.z.getClass();
        W52.t.d(zh0, jsonElementA);
    }

    @Override // defpackage.YH1
    public final T52<T> c() {
        if (this.a != null) {
            return this;
        }
        T52<T> t52 = this.h;
        if (t52 != null) {
            return t52;
        }
        T52<T> t52G = this.c.g(this.e, this.d);
        this.h = t52G;
        return t52G;
    }
}
