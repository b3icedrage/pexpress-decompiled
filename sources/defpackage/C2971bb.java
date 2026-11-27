package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2971bb {

    @NotNull
    public final Context a;
    public final boolean b;
    public final boolean c;

    @Nullable
    public a d;

    /* JADX INFO: renamed from: bb$a */
    public final class a {

        @Nullable
        public final String a;

        @Nullable
        public final String b;

        @Nullable
        public final String c;

        @NotNull
        public final String d;

        @NotNull
        public final String e;

        @NotNull
        public final String f;

        @NotNull
        public final String g;

        @NotNull
        public final String h;

        @Nullable
        public final String i;

        @NotNull
        public final String j;

        @Nullable
        public final String k;

        /* JADX WARN: Code duplicated, block: B:41:0x0136 A[EDGE_INSN: B:41:0x0136->B:54:0x016e BREAK  A[LOOP:0: B:49:0x015c->B:134:?]] */
        public a() {
            Class cls;
            String string;
            String str;
            String networkOperatorName;
            Location locationC;
            List<Address> fromLocation;
            String countryCode;
            String country;
            String networkCountryIso;
            boolean z = C2971bb.this.c;
            DS0.a aVar = DS0.a.h;
            DS0.a aVar2 = DS0.a.g;
            DS0.a aVar3 = DS0.a.e;
            if (z) {
                String MANUFACTURER = Build.MANUFACTURER;
                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                boolean zEquals = "Amazon".equals(MANUFACTURER);
                Context context = C2971bb.this.a;
                if (zEquals) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0);
                    string = Settings.Secure.getString(contentResolver, "advertising_id");
                    this.a = string;
                    cls = Context.class;
                } else {
                    try {
                        Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
                        cls = Context.class;
                        try {
                            Object objInvoke2 = objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(objInvoke, new Object[0]);
                            Boolean bool = objInvoke2 instanceof Boolean ? (Boolean) objInvoke2 : null;
                            if (bool != null) {
                                bool.booleanValue();
                            }
                            Object objInvoke3 = objInvoke.getClass().getMethod("getId", new Class[0]).invoke(objInvoke, new Object[0]);
                            Intrinsics.c(objInvoke3, "null cannot be cast to non-null type kotlin.String");
                            this.a = (String) objInvoke3;
                        } catch (ClassNotFoundException unused) {
                            Intrinsics.checkNotNullParameter("Google Play Services SDK not found for advertising id!", "message");
                            if (aVar3.compareTo(aVar2) <= 0) {
                                b0.e("Amplitude", "Google Play Services SDK not found for advertising id!");
                            }
                        } catch (InvocationTargetException unused2) {
                            Intrinsics.checkNotNullParameter("Google Play Services not available for advertising id", "message");
                            if (aVar3.compareTo(aVar2) <= 0) {
                                b0.e("Amplitude", "Google Play Services not available for advertising id");
                            }
                        } catch (Exception unused3) {
                            Intrinsics.checkNotNullParameter("Encountered an error connecting to Google Play Services for advertising id", "message");
                            if (aVar3.compareTo(aVar) <= 0) {
                                b0.c("Amplitude", "Encountered an error connecting to Google Play Services for advertising id");
                            }
                        }
                    } catch (ClassNotFoundException unused4) {
                        cls = Context.class;
                    } catch (InvocationTargetException unused5) {
                        cls = Context.class;
                    } catch (Exception unused6) {
                        cls = Context.class;
                    }
                    string = this.a;
                }
            } else {
                cls = Context.class;
                string = null;
            }
            this.a = string;
            C2971bb c2971bb = C2971bb.this;
            try {
                PackageInfo packageInfo = c2971bb.a.getPackageManager().getPackageInfo(c2971bb.a.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "context.packageManager.g…o(context.packageName, 0)");
                str = packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException | Exception unused7) {
                str = null;
            }
            this.c = str;
            this.d = "android";
            String RELEASE = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
            this.e = RELEASE;
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            this.f = BRAND;
            String MANUFACTURER2 = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER2, "MANUFACTURER");
            this.g = MANUFACTURER2;
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            this.h = MODEL;
            try {
                Object systemService = C2971bb.this.a.getSystemService("phone");
                Intrinsics.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            } catch (Exception unused8) {
                networkOperatorName = null;
            }
            this.i = networkOperatorName;
            C2971bb c2971bb2 = C2971bb.this;
            if (!c2971bb2.b || (locationC = c2971bb2.c()) == null) {
                countryCode = null;
                break;
            }
            try {
                if (Geocoder.isPresent() && (fromLocation = C2971bb.a(c2971bb2).getFromLocation(locationC.getLatitude(), locationC.getLongitude(), 1)) != null) {
                    Iterator<Address> it = fromLocation.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            countryCode = null;
                            break;
                        }
                        Address next = it.next();
                        if (next != null) {
                            countryCode = next.getCountryCode();
                            break;
                        }
                        countryCode = null;
                        break;
                    }
                }
                countryCode = null;
                break;
            } catch (IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException | SecurityException unused9) {
            }
            if (countryCode == null || countryCode.length() == 0) {
                try {
                    Object systemService2 = c2971bb2.a.getSystemService("phone");
                    Intrinsics.c(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    TelephonyManager telephonyManager = (TelephonyManager) systemService2;
                    if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                        country = null;
                    } else {
                        Locale US = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(US, "US");
                        country = networkCountryIso.toUpperCase(US);
                        Intrinsics.checkNotNullExpressionValue(country, "this as java.lang.String).toUpperCase(locale)");
                    }
                } catch (Exception unused10) {
                }
                if (country == null || country.length() == 0) {
                    country = a().getCountry();
                    Intrinsics.checkNotNullExpressionValue(country, "locale.country");
                }
                countryCode = country;
            }
            this.b = countryCode;
            String language = a().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "locale.language");
            this.j = language;
            try {
                String str2 = GooglePlayServicesUtil.GMS_ERROR_DIALOG;
                Object objInvoke4 = GooglePlayServicesUtil.class.getMethod("isGooglePlayServicesAvailable", cls).invoke(null, C2971bb.this.a);
                Integer num = objInvoke4 instanceof Integer ? (Integer) objInvoke4 : null;
                if (num != null) {
                    num.intValue();
                }
            } catch (ClassNotFoundException unused11) {
                Intrinsics.checkNotNullParameter("Google Play Services Util not found!", "message");
                if (aVar3.compareTo(aVar2) <= 0) {
                    b0.e("Amplitude", "Google Play Services Util not found!");
                }
            } catch (IllegalAccessException unused12) {
                Intrinsics.checkNotNullParameter("Google Play Services not available", "message");
                if (aVar3.compareTo(aVar2) <= 0) {
                    b0.e("Amplitude", "Google Play Services not available");
                }
            } catch (InvocationTargetException unused13) {
                Intrinsics.checkNotNullParameter("Google Play Services not available", "message");
                if (aVar3.compareTo(aVar2) <= 0) {
                    b0.e("Amplitude", "Google Play Services not available");
                }
            } catch (Exception e) {
                String message = "Error when checking for Google Play Services: " + e;
                Intrinsics.checkNotNullParameter(message, "message");
                if (aVar3.compareTo(aVar2) <= 0) {
                    b0.e("Amplitude", message);
                }
            } catch (NoClassDefFoundError unused14) {
                Intrinsics.checkNotNullParameter("Google Play Services Util not found!", "message");
                if (aVar3.compareTo(aVar2) <= 0) {
                    b0.e("Amplitude", "Google Play Services Util not found!");
                }
            } catch (NoSuchMethodException unused15) {
                Intrinsics.checkNotNullParameter("Google Play Services not available", "message");
                if (aVar3.compareTo(aVar2) <= 0) {
                    b0.e("Amplitude", "Google Play Services not available");
                }
            }
            try {
                Object objInvoke5 = AppSet.class.getMethod("getClient", cls).invoke(null, C2971bb.this.a);
                Object objInvoke6 = Tasks.class.getMethod("await", Task.class).invoke(null, objInvoke5.getClass().getMethod("getAppSetIdInfo", new Class[0]).invoke(objInvoke5, new Object[0]));
                Object objInvoke7 = objInvoke6.getClass().getMethod("getId", new Class[0]).invoke(objInvoke6, new Object[0]);
                Intrinsics.c(objInvoke7, "null cannot be cast to non-null type kotlin.String");
                this.k = (String) objInvoke7;
            } catch (ClassNotFoundException unused16) {
                Intrinsics.checkNotNullParameter("Google Play Services SDK not found for app set id!", "message");
                if (aVar3.compareTo(aVar2) <= 0) {
                    b0.e("Amplitude", "Google Play Services SDK not found for app set id!");
                }
            } catch (InvocationTargetException unused17) {
                Intrinsics.checkNotNullParameter("Google Play Services not available for app set id", "message");
                if (aVar3.compareTo(aVar2) <= 0) {
                    b0.e("Amplitude", "Google Play Services not available for app set id");
                }
            } catch (Exception unused18) {
                Intrinsics.checkNotNullParameter("Encountered an error connecting to Google Play Services for app set id", "message");
                if (aVar3.compareTo(aVar) <= 0) {
                    b0.c("Amplitude", "Encountered an error connecting to Google Play Services for app set id");
                }
            }
            this.k = this.k;
        }

        public static Locale a() {
            LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
            Intrinsics.checkNotNullExpressionValue(locales, "configuration.locales");
            if (locales.isEmpty()) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                return locale;
            }
            Locale locale2 = locales.get(0);
            Intrinsics.checkNotNullExpressionValue(locale2, "localeList.get(0)");
            return locale2;
        }
    }

    public C2971bb(@NotNull Context context, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = z;
        this.c = z2;
    }

    public static final Geocoder a(C2971bb c2971bb) {
        c2971bb.getClass();
        return new Geocoder(c2971bb.a, Locale.ENGLISH);
    }

    public final a b() {
        if (this.d == null) {
            this.d = new a();
        }
        return this.d;
    }

    @Nullable
    public final Location c() {
        List<String> providers;
        Location lastKnownLocation;
        DS0.a aVar = DS0.a.g;
        DS0.a aVar2 = DS0.a.e;
        Location location = null;
        if (this.b) {
            Context context = this.a;
            if (C6333rM.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 || C6333rM.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                Object systemService = context.getSystemService("location");
                LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
                if (locationManager != null) {
                    try {
                        providers = locationManager.getProviders(true);
                    } catch (SecurityException | Exception unused) {
                        providers = null;
                    }
                    if (providers != null) {
                        ArrayList<Location> arrayList = new ArrayList();
                        for (String str : providers) {
                            try {
                                Intrinsics.checkNotNull(str);
                                lastKnownLocation = locationManager.getLastKnownLocation(str);
                            } catch (SecurityException unused2) {
                                Intrinsics.checkNotNullParameter("Failed to get most recent location", "message");
                                if (aVar2.compareTo(aVar) <= 0) {
                                    b0.e("Amplitude", "Failed to get most recent location");
                                }
                                lastKnownLocation = null;
                            } catch (Exception unused3) {
                                Intrinsics.checkNotNullParameter("Failed to get most recent location", "message");
                                if (aVar2.compareTo(aVar) <= 0) {
                                    b0.e("Amplitude", "Failed to get most recent location");
                                }
                                lastKnownLocation = null;
                            }
                            if (lastKnownLocation != null) {
                                arrayList.add(lastKnownLocation);
                            }
                        }
                        long time = -1;
                        for (Location location2 : arrayList) {
                            if (location2.getTime() > time) {
                                time = location2.getTime();
                                location = location2;
                            }
                        }
                        return location;
                    }
                }
            }
        }
        return null;
    }
}
