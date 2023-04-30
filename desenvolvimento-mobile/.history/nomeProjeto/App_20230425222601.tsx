import { StatusBar } from 'expo-status-bar';
import { Button, StyleSheet, Text, View } from 'react-native';
import { LoginScreen } from './src/screens/login';
import imagemFundo from './../../../assets/imgs/background.png';


// export default function App() {
//   return (<LoginScreen/>);
// }

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//     backgroundColor: '#fff',
//     alignItems: 'center',
//     justifyContent: 'center',
//   },
// });

export function componente() {
  return (
    <ImageBackground source={imagemFundo} style={{ width: '100%', height: '100%' }}>
      <View>
        <Text>Login Screen</Text>
      </View>
    </ImageBackground>
  );
}