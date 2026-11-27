package defpackage;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: iT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4414iT<Model, Data> implements I01<Model, Data> {
    public final b.a a;

    /* JADX INFO: renamed from: iT$b */
    public static final class b<Model> implements J01<Model, InputStream> {
        public final a a = new a();

        /* JADX INFO: renamed from: iT$b$a */
        public class a {
            public final ByteArrayInputStream a(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<Model, InputStream> d(@NonNull J11 j11) {
            return new C4414iT(this.a);
        }
    }

    public C4414iT(b.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.I01
    public final boolean a(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // defpackage.I01
    public final I01.a<Data> b(@NonNull Model model, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        return new I01.a<>(new M71(model), new a(model.toString(), this.a));
    }

    /* JADX INFO: renamed from: iT$a */
    public static final class a<Data> implements InterfaceC6771tS<Data> {
        public final String d;
        public final b.a e;
        public ByteArrayInputStream g;

        public a(String str, b.a aVar) {
            this.d = str;
            this.e = aVar;
        }

        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final Class<Data> a() {
            return InputStream.class;
        }

        @Override // defpackage.InterfaceC6771tS
        public final void b() {
            try {
                this.g.close();
            } catch (IOException unused) {
            }
        }

        @Override // defpackage.InterfaceC6771tS
        public final void c(@NonNull EnumC7035uh1 enumC7035uh1, @NonNull InterfaceC6771tS.a<? super Data> aVar) {
            try {
                ByteArrayInputStream byteArrayInputStreamA = this.e.a(this.d);
                this.g = byteArrayInputStreamA;
                aVar.f(byteArrayInputStreamA);
            } catch (IllegalArgumentException e) {
                aVar.d(e);
            }
        }

        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final CS e() {
            return CS.d;
        }

        @Override // defpackage.InterfaceC6771tS
        public final void cancel() {
        }
    }
}
