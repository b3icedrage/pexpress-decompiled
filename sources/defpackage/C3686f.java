package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.a;
import io.jsonwebtoken.JwtParser;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3686f implements Kf2, J71 {

    @NotNull
    public static final C3686f d = new C3686f();

    @NotNull
    public static final void f(int i) {
        new Integer(i);
    }

    @NotNull
    public static final String g(@NotNull String str) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append((CharSequence) str, 1, str.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Nullable
    public static final Object h(@NotNull InterfaceC0942Ew interfaceC0942Ew, @NotNull InterfaceC1958Rw interfaceC1958Rw, @NotNull C5314mW.a aVar) {
        if (interfaceC0942Ew == interfaceC1958Rw) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if ((interfaceC0942Ew instanceof C2836aw) && (interfaceC1958Rw instanceof C2836aw)) {
            return ((C2836aw) interfaceC1958Rw).u((C2836aw) interfaceC0942Ew, Long.MAX_VALUE, aVar);
        }
        return ((interfaceC0942Ew instanceof AbstractC8135zw) && (interfaceC1958Rw instanceof AbstractC8135zw)) ? ED.f((AbstractC8135zw) interfaceC0942Ew, (AbstractC8135zw) interfaceC1958Rw, Long.MAX_VALUE, aVar) : i(interfaceC0942Ew, interfaceC1958Rw, Long.MAX_VALUE, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d A[Catch: all -> 0x00e1, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00e1, blocks: (B:38:0x00d7, B:40:0x00dd, B:26:0x007d), top: B:59:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x0038, B:30:0x00ac, B:32:0x00b5, B:47:0x00f0, B:21:0x0057), top: B:55:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #2 {all -> 0x00e1, blocks: (B:38:0x00d7, B:40:0x00dd, B:26:0x007d), top: B:59:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00cc -> B:15:0x003c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object i(defpackage.InterfaceC0942Ew r19, defpackage.InterfaceC1958Rw r20, long r21, defpackage.LM r23) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3686f.i(Ew, Rw, long, LM):java.lang.Object");
    }

    @NotNull
    public static final String j(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iG = StringsKt.G(str, " ", 0, false, 6);
        if (iG <= 0 || iG >= str.length() - 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, iG + 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return C1039Gc0.e(sb, strSubstring, JwtParser.SEPARATOR_CHAR);
    }

    @NotNull
    public static final Drawable k(@NotNull Context getDrawableCompat, int i) {
        Intrinsics.checkNotNullParameter(getDrawableCompat, "$this$getDrawableCompat");
        Drawable drawableD = C7652xe.d(getDrawableCompat, i);
        if (drawableD != null) {
            return drawableD;
        }
        throw new IllegalStateException(EK.e(i, "Invalid resource ID: ").toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Nullable
    public static final String l(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType == null) {
            extensionFromMimeType = "";
        }
        String str2 = (String) C6992uV1.b.get(extensionFromMimeType);
        return str2 == null ? "unknown" : str2;
    }

    public static boolean m(@Nullable String str, @Nullable String str2) {
        String string;
        return d.i(str != null ? StringsKt.d0(str).toString() : null, "application/vnd.android.package-archive") || !(str2 == null || (string = StringsKt.d0(str2).toString()) == null || !d.h(string, ".apk", true));
    }

    public static final boolean n(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        P92 p92Y0 = abstractC4649jL0.Y0();
        if (p92Y0 instanceof O70) {
            return true;
        }
        return (p92Y0 instanceof AbstractC2299We0) && (((AbstractC2299We0) p92Y0).c1() instanceof O70);
    }

    public static final boolean o(int i, String str) {
        char cCharAt = str.charAt(i);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    public static final void p(@NotNull a aVar, @NotNull List animations) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(animations, "animations");
        int size = animations.size();
        if (size == 2) {
            int iIntValue = ((Number) animations.get(0)).intValue();
            int iIntValue2 = ((Number) animations.get(1)).intValue();
            aVar.b = iIntValue;
            aVar.c = iIntValue2;
            aVar.d = 0;
            aVar.e = 0;
            return;
        }
        if (size != 4) {
            return;
        }
        int iIntValue3 = ((Number) animations.get(0)).intValue();
        int iIntValue4 = ((Number) animations.get(1)).intValue();
        int iIntValue5 = ((Number) animations.get(2)).intValue();
        int iIntValue6 = ((Number) animations.get(3)).intValue();
        aVar.b = iIntValue3;
        aVar.c = iIntValue4;
        aVar.d = iIntValue5;
        aVar.e = iIntValue6;
    }

    public static VE0 q(EnumC2880b72 enumC2880b72, boolean z, VO0 vo0, int i) {
        boolean z2 = (i & 1) != 0 ? false : z;
        boolean z3 = (i & 2) == 0;
        if ((i & 4) != 0) {
            vo0 = null;
        }
        Intrinsics.checkNotNullParameter(enumC2880b72, "<this>");
        return new VE0(enumC2880b72, z3, z2, vo0 != null ? C5487nJ1.b(vo0) : null, 34);
    }

    @NotNull
    public static final String r(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // defpackage.Kf2
    @Nullable
    public InterfaceC6013po1 b(@NotNull XY0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Override // defpackage.Kf2
    public boolean c(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return false;
    }

    @Override // defpackage.Kf2
    public void d(@NotNull XY0 key, @NotNull Bitmap bitmap, boolean z, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
    }

    @Override // defpackage.J71
    public Object e() {
        return new C7817yQ0();
    }

    @Override // defpackage.Kf2
    public void a(int i) {
    }
}
