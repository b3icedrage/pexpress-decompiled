package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.pexpress.tool.R;
import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Nm2 implements Zc2, InterfaceC7636xa {
    public static C2252Vq d;

    @NotNull
    public static final Nm2 e = new Nm2();
    public static final Nm2 g = new Nm2();

    @NotNull
    public static C1491Lx0 b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        EnumC2868b42 enumC2868b42 = EnumC2868b42.e;
        CR0 cr0 = CR0.ADX;
        String strE = e("close_price");
        String string = context.getString(R.string.indicator_close_price_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(R.string.close_price_not_localized);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new C1491Lx0(enumC2868b42, "close_price", strE, c("close_price"), string, string2, Integer.valueOf(R.string.indicator_close_price_text), Integer.valueOf(R.string.indicator_close_price_description), VE.c(EnumC2121Ty0.i), false, 58176);
    }

    @NotNull
    public static String c(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return "https://assets.pbotservices.com/images/indicators/indicator-charts/" + path + ".png";
    }

    @NotNull
    public static String e(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return "https://assets.pbotservices.com/images/indicators/" + path + ".png";
    }

    @NotNull
    public static final Object f(@NotNull I51 i51, @NotNull IJ0 p) {
        Intrinsics.checkNotNullParameter(i51, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        return i51.invoke();
    }

    public static boolean g(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @NotNull
    public static final String h(@NotNull FC classDescriptor, @NotNull String jvmDescriptor) {
        String internalName;
        Intrinsics.checkNotNullParameter(C3787fU.m, "<this>");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        String str = RE0.a;
        C1836Qh0 c1836Qh0I = C4900kZ.g(classDescriptor).i();
        Intrinsics.checkNotNullExpressionValue(c1836Qh0I, "toUnsafe(...)");
        QC qcF = RE0.f(c1836Qh0I);
        if (qcF != null) {
            internalName = C6952uI0.e(qcF);
            Intrinsics.checkNotNullExpressionValue(internalName, "internalNameByClassId(...)");
        } else {
            internalName = C1589Ne.m(classDescriptor, C3481e1.f);
        }
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        return internalName + JwtParser.SEPARATOR_CHAR + jvmDescriptor;
    }

    @Nullable
    public static final Class i(@NotNull ClassLoader classLoader, @NotNull String fqName) {
        Intrinsics.checkNotNullParameter(classLoader, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // defpackage.InterfaceC7636xa
    public void a(Bundle bundle) {
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    @Override // defpackage.Zc2
    public Object d(AbstractC7580xH0 abstractC7580xH0, float f) {
        return VH0.b(abstractC7580xH0, f);
    }
}
