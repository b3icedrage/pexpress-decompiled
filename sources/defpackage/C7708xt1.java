package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: xt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7708xt1 {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final WeakHashMap<d, SparseArray<c>> b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    /* JADX INFO: renamed from: xt1$a */
    public static class a {
        public static Drawable a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        public static Drawable b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* JADX INFO: renamed from: xt1$b */
    public static class b {
        public static int a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        @NonNull
        public static ColorStateList b(@NonNull Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* JADX INFO: renamed from: xt1$c */
    public static class c {
        public final ColorStateList a;
        public final Configuration b;
        public final int c;

        public c(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration, Resources.Theme theme) {
            this.a = colorStateList;
            this.b = configuration;
            this.c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: renamed from: xt1$d */
    public static final class d {
        public final Resources a;
        public final Resources.Theme b;

        public d(@NonNull Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.a.equals(dVar.a) && Objects.equals(this.b, dVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b);
        }
    }

    /* JADX INFO: renamed from: xt1$e */
    public static abstract class e {
        public final void a(int i) {
            new Handler(Looper.getMainLooper()).post(new RunnableC7223vc(this, i, 1));
        }

        public abstract void b(int i);

        public abstract void c(@NonNull Typeface typeface);
    }

    public static Typeface a(@NonNull Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    public static Typeface b(@NonNull Context context, int i, @NonNull TypedValue typedValue, int i2, e eVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            RU0<String, Typeface> ru0 = C4606j72.b;
            Typeface typeface = ru0.get(C4606j72.b(resources, i, string, i3, i2));
            if (typeface != null) {
                if (eVar != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC7918yt1(0, eVar, typeface));
                }
                typefaceA = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        C3624eh0.b bVarA = C3624eh0.a(resources.getXml(i), resources);
                        if (bVarA == null) {
                            b0.c("ResourcesCompat", "Failed to find font-family tag");
                            if (eVar != null) {
                                eVar.a(-3);
                            }
                        } else {
                            typefaceA = C4606j72.a(context, bVarA, resources, i, string, typedValue.assetCookie, i2, eVar, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceD = C4606j72.a.d(context, resources, i, string, i2);
                        if (typefaceD != null) {
                            ru0.put(C4606j72.b(resources, i, string, i4, i2), typefaceD);
                        }
                        if (eVar != null) {
                            if (typefaceD != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC7918yt1(0, eVar, typefaceD));
                            } else {
                                eVar.a(-3);
                            }
                        }
                        typefaceA = typefaceD;
                    }
                } catch (IOException e2) {
                    b0.d("ResourcesCompat", "Failed to read xml resource ".concat(string), e2);
                    if (eVar != null) {
                        eVar.a(-3);
                    }
                } catch (XmlPullParserException e3) {
                    b0.d("ResourcesCompat", "Failed to parse xml resource ".concat(string), e3);
                    if (eVar != null) {
                        eVar.a(-3);
                    }
                }
            }
        } else if (eVar != null) {
            eVar.a(-3);
        }
        if (typefaceA != null || eVar != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
