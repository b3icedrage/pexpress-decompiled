package defpackage;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.sentry.android.core.b0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class WU1 extends AbstractC4545it1 implements View.OnClickListener {
    public static final /* synthetic */ int B = 0;
    public int A;
    public final SearchView o;
    public final SearchableInfo p;
    public final Context q;
    public final WeakHashMap<String, Drawable.ConstantState> r;
    public final int s;
    public int t;
    public ColorStateList u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView) view.findViewById(R.id.text1);
            this.b = (TextView) view.findViewById(R.id.text2);
            this.c = (ImageView) view.findViewById(R.id.icon1);
            this.d = (ImageView) view.findViewById(R.id.icon2);
            this.e = (ImageView) view.findViewById(com.pexpress.tool.R.id.edit_query);
        }
    }

    public WU1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.e = true;
        this.g = null;
        this.d = false;
        this.h = -1;
        this.i = new AbstractC3568eR.a(this);
        this.j = new AbstractC3568eR.b(this);
        this.m = suggestionRowLayout;
        this.l = suggestionRowLayout;
        this.n = (LayoutInflater) context.getSystemService("layout_inflater");
        this.t = 1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.o = searchView;
        this.p = searchableInfo;
        this.s = searchView.getSuggestionCommitIconResId();
        this.q = context;
        this.r = weakHashMap;
    }

    public static String i(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            b0.d("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    @Override // defpackage.AbstractC3568eR
    public final void b(View view, Cursor cursor) {
        int i;
        Drawable drawableG;
        CharSequence charSequenceI;
        a aVar = (a) view.getTag();
        int i2 = this.A;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        TextView textView = aVar.a;
        if (textView != null) {
            String strI = i(cursor, this.v);
            textView.setText(strI);
            if (TextUtils.isEmpty(strI)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.q;
        TextView textView2 = aVar.b;
        if (textView2 != null) {
            String strI2 = i(cursor, this.x);
            if (strI2 != null) {
                if (this.u == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(com.pexpress.tool.R.attr.textColorSearchUrl, typedValue, true);
                    this.u = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strI2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.u, null), 0, strI2.length(), 33);
                charSequenceI = spannableString;
            } else {
                charSequenceI = i(cursor, this.w);
            }
            if (TextUtils.isEmpty(charSequenceI)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceI);
            if (TextUtils.isEmpty(charSequenceI)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView = aVar.c;
        if (imageView != null) {
            int i4 = this.y;
            if (i4 == -1) {
                drawableG = null;
            } else {
                drawableG = g(cursor.getString(i4));
                if (drawableG == null) {
                    ComponentName searchActivity = this.p.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.r;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = weakHashMap.get(strFlattenToShortString);
                        drawableG = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, UserVerificationMethods.USER_VERIFY_PATTERN);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    StringBuilder sbC = C1332Jw.c(iconResource, "Invalid icon resource ", " for ");
                                    sbC.append(searchActivity.flattenToShortString());
                                    b0.e("SuggestionsAdapter", sbC.toString());
                                    drawableG = null;
                                } else {
                                    drawableG = drawable;
                                }
                            } else {
                                drawableG = null;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            b0.e("SuggestionsAdapter", e.toString());
                        }
                        weakHashMap.put(strFlattenToShortString, drawableG == null ? null : drawableG.getConstantState());
                    }
                    if (drawableG == null) {
                        drawableG = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableG);
            if (drawableG == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableG.setVisible(false, false);
                drawableG.setVisible(true, false);
            }
        }
        ImageView imageView2 = aVar.d;
        if (imageView2 == null) {
            i = 1;
        } else {
            int i5 = this.z;
            Drawable drawableG2 = i5 == -1 ? null : g(cursor.getString(i5));
            imageView2.setImageDrawable(drawableG2);
            if (drawableG2 == null) {
                imageView2.setVisibility(8);
                i = 1;
            } else {
                imageView2.setVisibility(0);
                drawableG2.setVisible(false, false);
                i = 1;
                drawableG2.setVisible(true, false);
            }
        }
        int i6 = this.t;
        ImageView imageView3 = aVar.e;
        if (i6 != 2 && (i6 != i || (i3 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // defpackage.AbstractC3568eR
    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.v = cursor.getColumnIndex("suggest_text_1");
                this.w = cursor.getColumnIndex("suggest_text_2");
                this.x = cursor.getColumnIndex("suggest_text_2_url");
                this.y = cursor.getColumnIndex("suggest_icon_1");
                this.z = cursor.getColumnIndex("suggest_icon_2");
                this.A = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            b0.d("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // defpackage.AbstractC3568eR
    public final String d(Cursor cursor) {
        String strI;
        String strI2;
        if (cursor == null) {
            return null;
        }
        String strI3 = i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strI3 != null) {
            return strI3;
        }
        SearchableInfo searchableInfo = this.p;
        if (searchableInfo.shouldRewriteQueryFromData() && (strI2 = i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strI2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strI = i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strI;
    }

    @Override // defpackage.AbstractC3568eR
    public final View e(ViewGroup viewGroup) {
        View viewInflate = this.n.inflate(this.l, viewGroup, false);
        viewInflate.setTag(new a(viewInflate));
        ((ImageView) viewInflate.findViewById(com.pexpress.tool.R.id.edit_query)).setImageResource(this.s);
        return viewInflate;
    }

    public final Drawable f(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(C4564j.d(uri, "No authority: "));
        }
        try {
            Resources resourcesForApplication = this.q.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(C4564j.d(uri, "No path: "));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(C4564j.d(uri, "Single path segment is not a resource ID: "));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(C4564j.d(uri, "More than two path segments: "));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(C4564j.d(uri, "No resource found for: "));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(C4564j.d(uri, "No package found for authority: "));
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    public final Drawable g(String str) {
        WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.r;
        Context context = this.q;
        Drawable drawableF = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i;
                Drawable.ConstantState constantState = weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = C6333rM.getDrawable(context, i);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
                b0.e("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableF = f(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e) {
                                b0.d("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                            }
                            drawableF = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e2) {
                                b0.d("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e3) {
                    b0.e("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
                    if (drawableF != null) {
                        weakHashMap.put(str, drawableF.getConstantState());
                    }
                    return drawableF;
                }
                if (drawableF != null) {
                    weakHashMap.put(str, drawableF.getConstantState());
                }
            }
        }
        return drawableF;
    }

    @Override // defpackage.AbstractC3568eR, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            b0.f("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewInflate = this.n.inflate(this.m, viewGroup, false);
            if (viewInflate != null) {
                ((a) viewInflate.getTag()).a.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // defpackage.AbstractC3568eR, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            b0.f("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewE = e(viewGroup);
            ((a) viewE.getTag()).a.setText(e.toString());
            return viewE;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.q.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.g;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.g;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.o.r((CharSequence) tag);
        }
    }
}
