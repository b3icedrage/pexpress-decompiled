package defpackage;

import com.jivosite.sdk.model.pojo.push.Notification;
import com.jivosite.sdk.model.pojo.push.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: Fr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1007Fr1 {

    @NotNull
    public final C3903g11 a;

    @NotNull
    public final InterfaceC5889pD1 b;

    @NotNull
    public final InterfaceC3432dl1 c;

    @NotNull
    public final InterfaceC5570ni1 d;

    @NotNull
    public final InterfaceC1153Ho0 e;

    public C1007Fr1(@NotNull C3903g11 parser, @NotNull HV handler, @NotNull InterfaceC5889pD1 schedulers, @NotNull InterfaceC3432dl1 pushApi, @NotNull InterfaceC5570ni1 profileRepository, @NotNull InterfaceC1153Ho0 historyRepository) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(pushApi, "pushApi");
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        Intrinsics.checkNotNullParameter(historyRepository, "historyRepository");
        this.a = parser;
        this.b = schedulers;
        this.c = pushApi;
        this.d = profileRepository;
        this.e = historyRepository;
    }

    public final C3641el1 a(C7492wr1 c7492wr1) {
        U u;
        String str = (String) ((C2703aM1) c7492wr1.getData()).getOrDefault("u", null);
        C3903g11 c3903g11 = this.a;
        if (str == null) {
            u = null;
        } else {
            if (!new JSONObject(str).optBoolean("jivosdk", false)) {
                throw new IllegalArgumentException("Field jivosdk has missing");
            }
            u = (U) c3903g11.a(U.class).b(str);
        }
        String str2 = (String) ((C2703aM1) c7492wr1.getData()).getOrDefault("notification", null);
        Notification notification = str2 != null ? (Notification) c3903g11.a(Notification.class).b(str2) : null;
        if (u == null) {
            throw new IllegalArgumentException("There is no \"u\" field in push message");
        }
        if (notification != null) {
            return new C3641el1(u, notification);
        }
        throw new IllegalArgumentException("There is no \"notification\" field in push message");
    }
}
