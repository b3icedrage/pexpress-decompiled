package defpackage;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ds0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0853Ds0 {
    void cancelLocationUpdates(@NotNull GoogleApiClient googleApiClient, @NotNull LocationListener locationListener);

    @Nullable
    Location getLastLocation(@NotNull GoogleApiClient googleApiClient);

    void requestLocationUpdates(@NotNull GoogleApiClient googleApiClient, @NotNull LocationRequest locationRequest, @NotNull LocationListener locationListener);
}
