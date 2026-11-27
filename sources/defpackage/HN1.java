package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class HN1<T> implements InterfaceC6793tZ0<T> {

    @NotNull
    public final Gson a;
    public final T52<T> b;
    public final boolean c;

    public static final class a implements InterfaceC6793tZ0.a {

        @NotNull
        public final Gson a;

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
            Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
            return new HN1(this.a, typeToken);
        }
    }

    public HN1(Gson gson, TypeToken typeToken) {
        this.a = gson;
        this.b = gson.f(typeToken);
        this.c = Intrinsics.a(typeToken.getType(), C7128v72.d(C2017Sp1.a(String.class)));
    }

    @Override // defpackage.InterfaceC6793tZ0
    @NotNull
    public final AbstractC6583sZ0 a(T t) throws IOException {
        if (this.c) {
            return new AbstractC6583sZ0.b(String.valueOf(t));
        }
        C1481Lu c1481Lu = new C1481Lu();
        ZH0 zh0H = this.a.h(new OutputStreamWriter(new C1559Mu(c1481Lu), Charsets.UTF_8));
        try {
            this.b.b(zh0H, t);
            Unit unit = Unit.a;
            zh0H.close();
            return new AbstractC6583sZ0.b("42".concat(c1481Lu.X(c1481Lu.e).q()));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C6621sj.b(zh0H, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC6793tZ0
    public final T b(@NotNull AbstractC6583sZ0 message) throws IOException {
        String str;
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof AbstractC6583sZ0.b) {
            str = ((AbstractC6583sZ0.b) message).a;
        } else {
            if (!(message instanceof AbstractC6583sZ0.a)) {
                throw new C6489s51();
            }
            str = new String(((AbstractC6583sZ0.a) message).a, Charsets.UTF_8);
        }
        if (StringsKt.D(str, '[') || StringsKt.D(str, '{') || StringsKt.D(str, '\"')) {
            int length = str.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    charSequenceSubSequence = "";
                    break;
                }
                char cCharAt = str.charAt(i);
                if (cCharAt == '[' || cCharAt == '{' || cCharAt == '\"') {
                    charSequenceSubSequence = str.subSequence(i, str.length());
                    break;
                }
                i++;
            }
            str = charSequenceSubSequence.toString();
        }
        StringReader stringReader = new StringReader(str);
        this.a.getClass();
        C7790yH0 c7790yH0 = new C7790yH0(stringReader);
        c7790yH0.e = false;
        try {
            T tA = this.b.a(c7790yH0);
            Intrinsics.checkNotNull(tA);
            c7790yH0.close();
            return tA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C6621sj.b(c7790yH0, th);
                throw th2;
            }
        }
    }
}
