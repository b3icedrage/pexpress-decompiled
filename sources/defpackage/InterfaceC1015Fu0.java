package defpackage;

import io.sentry.featureflags.b;
import io.sentry.internal.eventprocessor.a;
import io.sentry.protocol.C4521c;
import io.sentry.protocol.C4525g;
import io.sentry.protocol.F;
import io.sentry.protocol.o;
import io.sentry.protocol.u;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1015Fu0 {
    @NotNull
    InterfaceC1327Ju0 A();

    void B(@Nullable InterfaceC4302hv0 interfaceC4302hv0);

    void C();

    @NotNull
    List<a> D();

    void E(@Nullable Object obj, @Nullable String str);

    @NotNull
    List<C2234Vk> F();

    void G(@NotNull KD1.c cVar);

    @NotNull
    C4521c H();

    @Nullable
    String I();

    void J(@NotNull u uVar);

    @NotNull
    List<String> K();

    @Nullable
    CI1 L(@NotNull KD1.b bVar);

    @NotNull
    C5364mj1 M(@NotNull KD1.a aVar);

    @NotNull
    List<N80> N();

    @Nullable
    String O();

    void b(@Nullable String str, @Nullable String str2);

    void c(@Nullable F f);

    void clear();

    @Nullable
    o d();

    @Nullable
    InterfaceC2347Wu0 e();

    @NotNull
    InterfaceC1015Fu0 f();

    @Nullable
    C4525g g();

    @NotNull
    Map<String, Object> getExtras();

    @Nullable
    NG1 getLevel();

    @Nullable
    CI1 getSession();

    @NotNull
    Map<String, String> getTags();

    @Nullable
    F getUser();

    void h(@Nullable NG1 ng1);

    @NotNull
    u k();

    void l(@NotNull C0702Bu c0702Bu, @Nullable C0841Do0 c0841Do0);

    void m(@NotNull List<String> list);

    void n(@Nullable String str, @Nullable String str2);

    void o(@NotNull u uVar);

    @NotNull
    C2688aH1 p();

    @NotNull
    Map<String, SF1> q();

    @Nullable
    InterfaceC4302hv0 r();

    void removeTag(@Nullable String str);

    @Nullable
    CI1 s();

    @Nullable
    KD1.d t();

    void u();

    @NotNull
    b v();

    void w(@NotNull C5364mj1 c5364mj1);

    @NotNull
    Queue<C0702Bu> x();

    @NotNull
    C5364mj1 y();

    void z(@Nullable String str);
}
