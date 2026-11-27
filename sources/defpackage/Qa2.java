package defpackage;

import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Qa2 implements Pa2 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final RL0 b;

    public Qa2(@NotNull C4923kf appData, @NotNull RL0 languageList) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(languageList, "languageList");
        this.a = appData;
        this.b = languageList;
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String A() {
        return ID.c("https://".concat(w()), "/pdf/offer_", D(), ".pdf");
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String B() {
        return "https://api.pbotservices.com/v1/scripts/pocketbot.js";
    }

    public final String C() {
        return C5491nL.c("https://", a());
    }

    public final String D() {
        String lowerCase = this.b.defaultValue().g.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return Intrinsics.a(lowerCase, "vi") ? "vt" : lowerCase;
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String a() {
        return "m.".concat(w());
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String b() {
        return "https://m.pocketoption.com/";
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String c() {
        return "pocketoption.com";
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String d() {
        return A();
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String e() {
        return "https://rocketmatix.com/privacy-policy?legal=true";
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String f() {
        return CollectionsKt.J(CollectionsKt.b0(2, StringsKt.R(p(), new char[]{'/'})), "/", null, null, null, 62);
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String g() {
        return "https://api.pbotservices.com/v1/scripts/pocketbot.js";
    }

    @Override // defpackage.Pa2
    @Nullable
    public final Object h(@NotNull C6548sN1 c6548sN1) {
        return ID.c(C(), "/", D(), "/login");
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String i() {
        String str;
        FF ff = (FF) this.a.b.getValue();
        return (ff == null || (str = ff.h) == null) ? ".".concat(w()) : str;
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String j() {
        return "https://api.pbotservices.com/v1/scripts/pocketbot-hide-terms.js";
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String k() {
        return A();
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String l() {
        return "https://api.pbotservices.com/v1/scripts/pocketbot.js";
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String m() {
        return "https://api.pbotservices.com/v1/scripts/pocket-deposit-page.js";
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String n() {
        return "https://api.pbotservices.com/v1/scripts/pocketbot.js";
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String o() {
        return "";
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String p() {
        return ID.c(C(), "/", D(), "/cabinet");
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String q() {
        return "https://rocketmatix.com/terms?legal=true";
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String r() {
        return "https://api.pbotservices.com/v1/scripts/pocketbot-hide-payments-header.js";
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String s() {
        return "https://api.pbotservices.com/v1/scripts/pocketbot.js";
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String t() {
        String str;
        FF ff = (FF) this.a.b.getValue();
        if (ff != null && (str = ff.v) != null) {
            String strM = d.m(str, "/en/", "/" + D() + "/");
            if (strM != null) {
                return strM;
            }
        }
        return ID.c(C(), "/", D(), "/cabinet/withdrawal");
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String u() {
        return "https://api.pbotservices.com/v1/scripts/pocket-chart-page.js";
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String v() {
        return "https://api.pbotservices.com/v1/scripts/pocketbot-hide-terms.js";
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String w() {
        FF ff = (FF) this.a.b.getValue();
        return ff != null ? ff.g : "platform50.po2.capital";
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String x() {
        return "https://api.pbotservices.com/v1/scripts/pocketbot.js";
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String y() {
        return ID.c(C(), "/", D(), "/cabinet/profile");
    }

    @Override // defpackage.Pa2
    @NotNull
    public final String z() {
        return ID.c(C(), "/", D(), "/cabinet/deposit-step-1");
    }
}
