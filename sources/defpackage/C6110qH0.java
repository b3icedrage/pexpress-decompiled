package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6110qH0 implements RJ0<JsonObject> {

    @NotNull
    public static final C6110qH0 a = new C6110qH0();

    @NotNull
    public static final a b = a.b;

    /* JADX INFO: renamed from: qH0$a */
    public static final class a implements MH1 {

        @NotNull
        public static final a b = new a();

        @NotNull
        public static final String c = "kotlinx.serialization.json.JsonObject";
        public final /* synthetic */ C1306Jn0 a;

        public a() {
            C1173Hv.d(C4881kS1.a);
            this.a = C1173Hv.b(C6144qS1.a, TG0.a).c;
        }

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
            return 2;
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
            return RS1.c.a;
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
        JsonObject value = (JsonObject) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        C5207m.a(encoder);
        C1173Hv.d(C4881kS1.a);
        C1173Hv.b(C6144qS1.a, TG0.a).a(encoder, value);
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
        C1173Hv.d(C4881kS1.a);
        C6976uQ0 c6976uQ0B = C1173Hv.b(C6144qS1.a, TG0.a);
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new JsonObject((Map) c6976uQ0B.i(decoder));
    }
}
