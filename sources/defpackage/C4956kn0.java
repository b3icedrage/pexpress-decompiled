package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4956kn0<T> implements InterfaceC6793tZ0<T> {
    public final Gson a;
    public final T52<T> b;

    /* JADX INFO: renamed from: kn0$a */
    public static final class a implements InterfaceC6793tZ0.a {
        public final Gson a;

        static {
            new Gson();
        }

        public a(@NotNull Gson gson) {
            Intrinsics.checkNotNullParameter(gson, "gson");
            this.a = gson;
        }

        @Override // defpackage.InterfaceC6793tZ0.a
        @NotNull
        public final InterfaceC6793tZ0<?> a(@NotNull Type type, @NotNull Annotation[] annotations) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            TypeToken<?> typeToken = TypeToken.get(type);
            Gson gson = this.a;
            T52<T> typeAdapter = gson.f(typeToken);
            Intrinsics.checkNotNullExpressionValue(typeAdapter, "typeAdapter");
            return new C4956kn0(gson, typeAdapter);
        }
    }

    public C4956kn0(Gson gson, T52 t52) {
        this.a = gson;
        this.b = t52;
    }

    @Override // defpackage.InterfaceC6793tZ0
    @NotNull
    public final AbstractC6583sZ0 a(T t) throws IOException {
        C1481Lu c1481Lu = new C1481Lu();
        ZH0 zh0H = this.a.h(new OutputStreamWriter(new C1559Mu(c1481Lu), StandardCharsets.UTF_8));
        this.b.b(zh0H, t);
        zh0H.close();
        String stringValue = c1481Lu.X(c1481Lu.e).q();
        Intrinsics.checkNotNullExpressionValue(stringValue, "stringValue");
        return new AbstractC6583sZ0.b(stringValue);
    }

    @Override // defpackage.InterfaceC6793tZ0
    public final T b(@NotNull AbstractC6583sZ0 message) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof AbstractC6583sZ0.b) {
            str = ((AbstractC6583sZ0.b) message).a;
        } else {
            if (!(message instanceof AbstractC6583sZ0.a)) {
                throw new C6489s51();
            }
            str = new String(((AbstractC6583sZ0.a) message).a, Charsets.UTF_8);
        }
        StringReader stringReader = new StringReader(str);
        this.a.getClass();
        C7790yH0 c7790yH0 = new C7790yH0(stringReader);
        c7790yH0.e = false;
        T tA = this.b.a(c7790yH0);
        Intrinsics.checkNotNull(tA);
        return tA;
    }
}
