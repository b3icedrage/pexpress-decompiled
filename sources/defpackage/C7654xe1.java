package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xe1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7654xe1 implements InterfaceC7444we1 {

    @NotNull
    public final Pa2 a;

    @NotNull
    public final KW1 b;

    public C7654xe1(@NotNull Pa2 urlsProvider) {
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        this.a = urlsProvider;
        this.b = XO0.b(new P4(this, 8));
    }

    @Override // defpackage.InterfaceC7444we1
    @NotNull
    public final String a() {
        return Z0.c(k(), "/en/login");
    }

    @Override // defpackage.InterfaceC7444we1
    @NotNull
    public final String b() {
        return Z0.c(k(), "/ajax-trading/get-balance");
    }

    @Override // defpackage.InterfaceC7444we1
    @NotNull
    public final String c() {
        return Z0.c(k(), "/en/register");
    }

    @Override // defpackage.InterfaceC7444we1
    @NotNull
    public final String d() {
        return Z0.c(k(), "/en/password_recovery");
    }

    @Override // defpackage.InterfaceC7444we1
    @NotNull
    public final String e() {
        return Z0.c(k(), "/ajax-trading/deposit-demo");
    }

    @Override // defpackage.InterfaceC7444we1
    @NotNull
    public final String f() {
        return Z0.c(k(), "/en/cabinet");
    }

    @Override // defpackage.InterfaceC7444we1
    @NotNull
    public final String g() {
        return Z0.c(k(), "/en/cabinet/balance-history/?t=d");
    }

    @Override // defpackage.InterfaceC7444we1
    @NotNull
    public final String h() {
        return Z0.c(k(), "/en/logout/mobile");
    }

    @Override // defpackage.InterfaceC7444we1
    @NotNull
    public final String i() {
        return Z0.c(k(), "/ajax-trading/get-demo-balance");
    }

    @Override // defpackage.InterfaceC7444we1
    @NotNull
    public final String j() {
        return a();
    }

    public final String k() {
        return (String) this.b.getValue();
    }
}
