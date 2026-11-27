package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6526sG0 implements RJ0<JsonArray> {

    @NotNull
    public static final C6526sG0 a = new C6526sG0();

    @NotNull
    public static final a b = a.b;

    /* JADX INFO: renamed from: sG0$a */
    public static final class a implements MH1 {

        @NotNull
        public static final a b = new a();

        @NotNull
        public static final String c = "kotlinx.serialization.json.JsonArray";
        public final /* synthetic */ C7251vj a = C1173Hv.a(TG0.a).b;

        @Override // defpackage.MH1
        @NotNull
        public final String a() {
            return c;
        }

        @Override // defpackage.MH1
        public final boolean c() {
            this.a.getClass();
            return false;
        }

        @Override // defpackage.MH1
        public final int d(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.a.d(name);
        }

        @Override // defpackage.MH1
        public final int e() {
            this.a.getClass();
            return 1;
        }

        @Override // defpackage.MH1
        @NotNull
        public final String f(int i) {
            this.a.getClass();
            return String.valueOf(i);
        }

        @Override // defpackage.MH1
        @NotNull
        public final List<Annotation> g(int i) {
            return this.a.g(i);
        }

        @Override // defpackage.MH1
        @NotNull
        public final VH1 h() {
            this.a.getClass();
            return RS1.b.a;
        }

        @Override // defpackage.MH1
        @NotNull
        public final MH1 i(int i) {
            return this.a.i(i);
        }

        @Override // defpackage.MH1
        public final boolean j(int i) {
            this.a.j(i);
            return false;
        }

        @Override // defpackage.MH1
        @NotNull
        public final List<Annotation> k() {
            this.a.getClass();
            return C5653o60.d;
        }

        @Override // defpackage.MH1
        public final boolean m() {
            this.a.getClass();
            return false;
        }
    }

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        JsonArray value = (JsonArray) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        C5207m.a(encoder);
        C1173Hv.a(TG0.a).a(encoder, value);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        C5207m.c(decoder);
        C7462wj c7462wjA = C1173Hv.a(TG0.a);
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new JsonArray((List) c7462wjA.i(decoder));
    }
}
