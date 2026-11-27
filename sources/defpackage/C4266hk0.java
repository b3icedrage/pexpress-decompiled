package defpackage;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lhk0;", "LDs0;", "<init>", "()V", "Lcom/google/android/gms/common/api/GoogleApiClient;", "googleApiClient", "Lcom/google/android/gms/location/LocationListener;", "locationListener", "", "cancelLocationUpdates", "(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationListener;)V", "Lcom/google/android/gms/location/LocationRequest;", "locationRequest", "requestLocationUpdates", "(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;)V", "Landroid/location/Location;", "getLastLocation", "(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/location/Location;", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C4266hk0 implements InterfaceC0853Ds0 {
    @Override // defpackage.InterfaceC0853Ds0
    public void cancelLocationUpdates(@NotNull GoogleApiClient googleApiClient, @NotNull LocationListener locationListener) {
        Intrinsics.checkNotNullParameter(googleApiClient, "googleApiClient");
        Intrinsics.checkNotNullParameter(locationListener, "locationListener");
        if (googleApiClient.isConnected()) {
            LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, locationListener);
        } else {
            NS0.warn$default("GoogleApiClient is not connected. Unable to cancel location updates.", null, 2, null);
        }
    }

    @Override // defpackage.InterfaceC0853Ds0
    @Nullable
    public Location getLastLocation(@NotNull GoogleApiClient googleApiClient) {
        Intrinsics.checkNotNullParameter(googleApiClient, "googleApiClient");
        if (googleApiClient.isConnected()) {
            return LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
        }
        return null;
    }

    @Override // defpackage.InterfaceC0853Ds0
    public void requestLocationUpdates(@NotNull GoogleApiClient googleApiClient, @NotNull LocationRequest locationRequest, @NotNull LocationListener locationListener) {
        Intrinsics.checkNotNullParameter(googleApiClient, "googleApiClient");
        Intrinsics.checkNotNullParameter(locationRequest, "locationRequest");
        Intrinsics.checkNotNullParameter(locationListener, "locationListener");
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            if (googleApiClient.isConnected()) {
                LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, locationListener);
            }
        } catch (Throwable th) {
            NS0.warn("FusedLocationApi.requestLocationUpdates failed!", th);
        }
    }
}
