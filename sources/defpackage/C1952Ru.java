package defpackage;

import android.webkit.WebView;
import android.widget.EditText;
import androidx.annotation.NonNull;
import io.jsonwebtoken.JwtParser;
import java.io.EOFException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1952Ru implements Zc2, InterfaceC5361mi2, InterfaceC1555Ms1 {
    public static final C1952Ru d = new C1952Ru();
    public static final String[] e = new String[0];

    public static final String e(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        sb.append(C1526Mj.x(parameterTypes, "", "(", ")", WY.h, 24));
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        sb.append(C4753jp1.b(returnType));
        return sb.toString();
    }

    public static final boolean f(Object[] objArr, int i, int i2, List list) {
        if (i2 == list.size()) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (Intrinsics.a(objArr[i + i3], list.get(i3))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String g(Object[] objArr, int i, int i2, M0 m0) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == m0) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static int h(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    @NotNull
    public static final C4814k70 i(@NotNull Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new C4814k70(entries);
    }

    @NotNull
    public static String j() {
        String language;
        Locale locale = AbstractC2759ae.g().a.a.get(0);
        if (locale == null || (language = locale.getLanguage()) == null) {
            language = Locale.getDefault().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        }
        int iHashCode = language.hashCode();
        if (iHashCode != 3365) {
            if (iHashCode != 3374) {
                if (iHashCode == 3391 && language.equals("ji")) {
                    return "yi";
                }
            } else if (language.equals("iw")) {
                return "he";
            }
        } else if (language.equals("in")) {
            return "id";
        }
        return language;
    }

    public static final int k(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static boolean l(@NonNull EditText editText) {
        return editText.getInputType() != 0;
    }

    public static final void m(@NotNull C1640Nu c1640Nu, @NotNull ByteBuffer dst, int i) throws EOFException {
        Intrinsics.checkNotNullParameter(c1640Nu, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        ByteBuffer byteBuffer = c1640Nu.a;
        int i2 = c1640Nu.b;
        if (c1640Nu.c - i2 < i) {
            throw new EOFException("Not enough bytes to read a buffer content of size " + i + JwtParser.SEPARATOR_CHAR);
        }
        int iLimit = dst.limit();
        try {
            dst.limit(dst.position() + i);
            C6621sj.c(byteBuffer, dst, i2);
            dst.limit(iLimit);
            Unit unit = Unit.a;
            c1640Nu.c(i);
        } catch (Throwable th) {
            dst.limit(iLimit);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NotNull
    public static final C5655o62 n(@NotNull C5655o62 thisRef, @NotNull InterfaceC2396Xc newAnnotations) {
        C5655o62 c5655o62A;
        Intrinsics.checkNotNullParameter(thisRef, "<this>");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        if (C2979bd.a(thisRef) == newAnnotations) {
            return thisRef;
        }
        Intrinsics.checkNotNullParameter(thisRef, "<this>");
        IJ0<Object> property = C2979bd.a[0];
        C5658o71 c5658o71 = C2979bd.b;
        c5658o71.getClass();
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        C2755ad attribute = (C2755ad) thisRef.b().get(c5658o71.a);
        if (attribute != null) {
            Intrinsics.checkNotNullParameter(attribute, "attribute");
            if (thisRef.isEmpty()) {
                c5655o62A = thisRef;
            } else {
                Iterable iterable = thisRef.d;
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (!Intrinsics.a((AbstractC5022l62) obj, attribute)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == thisRef.d.b()) {
                    c5655o62A = thisRef;
                } else {
                    C5655o62.e.getClass();
                    c5655o62A = C5655o62.a.a(arrayList);
                }
            }
            if (c5655o62A != null) {
                thisRef = c5655o62A;
            }
        }
        if (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) {
            C2755ad attribute2 = new C2755ad(newAnnotations);
            Intrinsics.checkNotNullParameter(attribute2, "attribute");
            Intrinsics.checkNotNullParameter(attribute2, "attribute");
            RI0<? extends C2755ad> kClass = attribute2.b();
            C5655o62.a aVar = C5655o62.e;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            String keyQualifiedName = kClass.d();
            Intrinsics.checkNotNull(keyQualifiedName);
            Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
            if (thisRef.d.get(aVar.b(aVar.a, keyQualifiedName, new JC(aVar, 1))) == null) {
                return thisRef.isEmpty() ? new C5655o62(VE.c(attribute2)) : C5655o62.a.a(CollectionsKt.R(CollectionsKt.e0(thisRef), attribute2));
            }
        }
        return thisRef;
    }

    public static final void o(@NotNull Object[] objArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i < i2) {
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            objArr[i] = null;
            i++;
        }
    }

    @NotNull
    public static final C5655o62 p(@NotNull InterfaceC2396Xc annotations) {
        Intrinsics.checkNotNullParameter(annotations, "<this>");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (annotations.isEmpty()) {
            C5655o62.e.getClass();
            return C5655o62.g;
        }
        C5655o62.a aVar = C5655o62.e;
        List listC = VE.c(new C2755ad(annotations));
        aVar.getClass();
        return C5655o62.a.a(listC);
    }

    @Override // defpackage.InterfaceC5361mi2
    public String[] b() {
        return e;
    }

    @Override // defpackage.InterfaceC5361mi2
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.Zc2
    public Object d(AbstractC7580xH0 abstractC7580xH0, float f) {
        return Float.valueOf(VH0.d(abstractC7580xH0) * f);
    }

    @Override // defpackage.InterfaceC5361mi2
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
